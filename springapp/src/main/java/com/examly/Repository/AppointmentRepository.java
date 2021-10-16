package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<AppointmentModel , String> {
    
}
