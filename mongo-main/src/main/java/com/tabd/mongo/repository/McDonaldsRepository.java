package com.tabd.mongo.repository;

import com.tabd.mongo.model.McDonalds;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McDonaldsRepository extends MongoRepository<McDonalds, Integer> {

}
