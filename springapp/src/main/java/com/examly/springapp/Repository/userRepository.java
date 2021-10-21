package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;

public interface userRepository  extends CrudRepository<UserModel , Long> {
    
}
