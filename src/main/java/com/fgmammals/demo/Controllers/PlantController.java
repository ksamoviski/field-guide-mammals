package com.fgmammals.demo.Controllers;


import com.fgmammals.demo.Repositories.AnimalRepository;
import com.fgmammals.demo.Repositories.PlantRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PlantController {


    @Resource
    private PlantRepository plantRepo;

    @RequestMapping("/plants")
    public String displayAllPlantsInDatabase(Model model) {
        model.addAttribute("plantsList", plantRepo.findAll());
        return "allPlantsView";
    }

    @RequestMapping("/plants/{commonName}")
    public String displayPlantByCommonName(@PathVariable String commonName, Model model) {
        model.addAttribute("plant", plantRepo.findByCommonName(commonName));
        return "individualPlantPageView";
    }





}
