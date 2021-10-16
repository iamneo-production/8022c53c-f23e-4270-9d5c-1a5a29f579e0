package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import java.lang.IllegalArgumentException;
import java.util.Optional;

@Service
public class AppointmentService {


    @Autowired
    private AppointmentRepository appointmentRepository;

    public AppointmentModel getAppointment(String email){
        Optional<AppointmentModel> appointmentModel = appointmentRepository.findById(email);
         AppointmentModel value = appointmentModel.orElseThrow(() -> 
                                new RuntimeException("No such data found"));
         return value;
    }

    public void addAppointment(AppointmentModel appointmentModel){
        appointmentRepository.save(appointmentModel);
    }

    public void updateAppointment(String email , AppointmentModel appointmentModel){
        appointmentRepository.save(appointmentModel);
    }

    public void removeAppointment(String email){
        appointmentRepository.deleteById(email);
    }
}
