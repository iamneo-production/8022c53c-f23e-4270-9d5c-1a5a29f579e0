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
public class TrainerController {
    
    @Autowired 
    private BookingService bookingService;
    

    @RequestMapping("/Trainer/booking")
    public List<BookingModel> getAllBooking(){
        return bookingService.getAllBooking();
    }

    @RequestMapping(method=RequestMethod.POST , value="/Trainer/booking")
    public void approveBooking(){
        bookingService.approveBooking();
    }
    @RequestMapping(method=RequestMethod.DELETE , value="/Trainer/booking/{id}")
    public void removeBooking(@PathVariable String id){
        bookingService.removeBooking(id);
    }
}