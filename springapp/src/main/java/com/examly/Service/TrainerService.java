package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import java.lang.IllegalArgumentException;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    public void addTrainer(TrainerModel  trainerModel){
        trainerRepository.save(trainerModel);
    }

    public List<TrainerModel> getAllTrainer(){
        List<TrainerModel> l=new ArrayList<>();
        trainerRepository.findAll().forEach(l::add);
        return l;
    }

    public void updateTrainer(String emailid , TrainerModel trainerModel){
        trainerRepository.save(trainerModel);
    }

    public void deleteTrainer(String emailid){
        trainerRepository.deleteById(emailid);
    }
}
