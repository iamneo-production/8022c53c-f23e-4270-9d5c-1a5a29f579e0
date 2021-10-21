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
public class ReportController {
    
        @Autowired
        private ReportService reportservice;

        @RequestMapping("/checkupReport/{id}")
        public ReportModel getRepor(@PathVariable String id){
            return reportservice.getReportDetails(id);
        }
}
