package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;

public interface TrainerRepository extends CrudRepository<TrainerModel , String> {
    
}
