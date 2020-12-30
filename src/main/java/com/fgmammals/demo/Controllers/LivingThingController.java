package com.fgmammals.demo.Controllers;


import com.fgmammals.demo.Repositories.AnimalRepository;
import com.fgmammals.demo.Repositories.LivingThingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class LivingThingController {



    @Resource
    private LivingThingRepository livingThingRepo;

    @RequestMapping("/livingThings")
    public String displayAllLivingThingsInDatabase(Model model) {
        model.addAttribute("livingThingsList", livingThingRepo.findAll());
        return "allLivingThingsView";
    }

    @RequestMapping("/livingThing/{commonName}")
    public String displayLivingThingByCommonName(@PathVariable String commonName, Model model) {
        model.addAttribute("animal", livingThingRepo.findByCommonName(commonName));
        return "individualLivingThingPageView";
    }





}
