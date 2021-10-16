package com.examly.springapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;
    @Autowired
    private BookingModel bookingModel;
   
    @RequestMapping(method=RequestMethod.POST , value="/booking")
	public void addBooking(@RequestBody BookingModel bookingModel){
		bookingService.addBooking(bookingModel);     
	}

    @RequestMapping(method=RequestMethod.DELETE , value="/booking/{id}")
	public void removeBooking(@PathVariable String id){
		bookingService.removeBooking(id);     
	}
    
}
