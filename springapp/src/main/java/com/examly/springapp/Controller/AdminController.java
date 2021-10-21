package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AdminController {
    @Autowired
    private TrainerService trainerService;

    @RequestMapping("/Admin/")
    public List<TrainerModel> getAllTrainer(){
        return trainerService.getAllTrainer();
    }

    @RequestMapping(method=RequestMethod.POST , value="/Admin/add")
    public void addTrainer(@RequestBody TrainerModel trainerModel){
        trainerService.addTrainer(trainerModel);
    }

    @RequestMapping(method=RequestMethod.PUT , value="/Admin/update/{emailid}")
    public void updateTrainer(@RequestBody TrainerModel trainerModel , @PathVariable String emailid){
        trainerService.updateTrainer(emailid , trainerModel);
    }

    @RequestMapping(method=RequestMethod.DELETE , value="/Admin/remove/{emailid}")
    public void deleteTrainer(@PathVariable String emailid){
        trainerService.deleteTrainer(emailid);
    }
}