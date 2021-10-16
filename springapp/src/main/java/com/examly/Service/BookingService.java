package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import java.lang.IllegalArgumentException;

@Service
public class BookingService {
    
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private BookingModel bookingModel;

    public void addBooking(BookingModel bookingModel){
        bookingRepository.save(bookingModel);
    }

    public List<BookingModel> getAllBooking(){
        List<BookingModel> l=new ArrayList<>();
        bookingRepository.findAll().forEach(l::add);
        return l;
    }    

    public void removeBooking(String id){
        bookingRepository.deleteById(id);
    }

    public void approveBooking(){
        List<BookingModel> bookings= (List<BookingModel>) bookingRepository.findAll();
        for(BookingModel booking : bookings){
            booking.setBookingStatus(true);
            bookingRepository.save(booking);
        }
    }
}
