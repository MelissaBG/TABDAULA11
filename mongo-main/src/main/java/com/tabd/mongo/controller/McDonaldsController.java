package com.tabd.mongo.controller;

import com.tabd.mongo.model.McDonalds;
import com.tabd.mongo.service.McDonaldsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="mongo")
public class McDonaldsController {
    private McDonaldsService mcDonaldsService;

    public McDonaldsController(McDonaldsService mcDonaldsService){
        this.mcDonaldsService = mcDonaldsService;
    }

    @GetMapping(value="/mcDonalds")
    public ResponseEntity<List<McDonalds>> obterPedido() {
        List<McDonalds> mcDonalds = mcDonaldsService.list();
        return new ResponseEntity<List<McDonalds>>(mcDonalds, HttpStatus.OK) ;
    }

    @GetMapping(value="/mcDonalds/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        Optional<McDonalds> mcDonalds = this.mcDonaldsService.findById(id);
        return new ResponseEntity<Optional<McDonalds>>(mcDonalds,HttpStatus.OK);
    }

    @PostMapping(value="/mcDonalds")
    public ResponseEntity<?> salvar(@RequestBody McDonalds mcDonalds) {
        this.mcDonaldsService.save(mcDonalds);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value="/mcDonalds/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Integer id) {
        this.mcDonaldsService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
