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
public class ReportService {
    
    @Autowired
    private ReportRepository reportRepository;

    public void addReport(ReportModel reportModel){
        reportRepository.save(reportModel);
    }

    public void updateReport(String id , ReportModel reportModel){
        reportRepository.save(reportModel);
    }

    public ReportModel getReportDetails(String id){
        Optional<ReportModel> reportModel = reportRepository.findById(id);
        ReportModel value = reportModel.orElseThrow(() -> 
                                new RuntimeException("No such data found"));
         return value;
    }
}
