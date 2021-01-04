package com.fgmammals.demo.Controllers;

import com.fgmammals.demo.Repositories.ObservationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ObservationController {

    @Resource
    ObservationRepository observationRepo;

    @RequestMapping("/observations")
    public String displayAllObservations(Model model) {
        model.addAttribute("allObservations", observationRepo.findAll());
        return "observationsView";
    }

//    @RequestMapping("/observationsByDate")
//    public String displayObservationsByDate(Model model) {
//
//    }






}
