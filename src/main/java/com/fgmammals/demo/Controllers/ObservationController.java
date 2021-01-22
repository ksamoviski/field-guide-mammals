package com.fgmammals.demo.Controllers;


import com.fgmammals.demo.Repositories.ObservationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ObservationController {

    @Resource
    private ObservationRepository observationRepo;

    @RequestMapping("/observations")
    public String displayAllObservationsInDatabase(Model model) {
        model.addAttribute("observationsList", observationRepo.findAll());
        return "observationsView";
    }
}
