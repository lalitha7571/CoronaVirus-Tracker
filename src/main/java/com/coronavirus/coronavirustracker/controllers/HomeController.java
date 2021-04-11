package com.coronavirus.coronavirustracker.controllers;


import com.coronavirus.coronavirustracker.models.LocationStats;
import com.coronavirus.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;



@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;


    @GetMapping("/")
    public String home(Model model){

        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
       int totalCases=  allStats.stream().mapToInt(stat-> stat.getLatestReports()).sum();
        int NewCases=  allStats.stream().mapToInt(stat-> stat.getDiffFromPreviousDay()).sum();

        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalCases);
        model.addAttribute("totalNewCases",NewCases);

        return "home";

    }
}
