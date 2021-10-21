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
public class AppointmentController {
        @Autowired 
        private AppointmentService appointmentService;

        @RequestMapping(method=RequestMethod.POST , value="/Trainer/Appointment")
        public void addAppointment(@RequestBody AppointmentModel appointmentModel){
                appointmentService.addAppointment(appointmentModel);
        }

        @RequestMapping(method=RequestMethod.PUT , value="/Trainer/Appointment/{id}")
        public void updateAppointment(@RequestBody AppointmentModel appointmentModel , @PathVariable String id){
            appointmentService.updateAppointment(id , appointmentModel);
        }

        @RequestMapping(method=RequestMethod.DELETE , value="/Trainer/Appointment/{id} ")
        public void deleteAppointment(@PathVariable String id){
            appointmentService.removeAppointment(id);
        }

        @RequestMapping(method=RequestMethod.GET , value="/Appointment/{id}")
        public AppointmentModel getAppointment(@PathVariable String id){
            return appointmentService.getAppointment(id);
        }
}