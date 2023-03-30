package com.tabd.mongo.service;

import com.tabd.mongo.model.McDonalds;
import com.tabd.mongo.repository.McDonaldsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class McDonaldsService {

    private McDonaldsRepository mcDonaldsRepository;

    public McDonaldsService(McDonaldsRepository mcDonaldsRepository){
        this.mcDonaldsRepository = mcDonaldsRepository;
    }

    public void save(McDonalds mcDonalds){
        this.mcDonaldsRepository.save(mcDonalds);
    }

    public void delete(Integer id){
        this.mcDonaldsRepository.deleteById(id);
    }

    public Optional<McDonalds> findById(Integer id){
        return this.mcDonaldsRepository.findById(id);
    }

    public List<McDonalds> list() {
        return this.mcDonaldsRepository.findAll();
    }

    public void update(Integer id){
        Optional<McDonalds> pessoa = this.mcDonaldsRepository.findById(id);
        //this.mcDonaldsRepository.save(mcDonalds);
    }
}
