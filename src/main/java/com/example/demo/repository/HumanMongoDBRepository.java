package com.example.demo.repository;

import com.example.demo.entity.mongo.Human;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HumanMongoDBRepository extends MongoRepository<Human, String> {
}

