package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<BookingModel , String> {
    
}
