package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel , Long> {
    UserModel findByEmail(String email);
}





