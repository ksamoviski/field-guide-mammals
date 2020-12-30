package com.fgmammals.demo.Controllers;


import com.fgmammals.demo.Repositories.AnimalRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class AnimalController {


    @Resource
    private AnimalRepository animalRepo;


    @RequestMapping("/home")
    public String displayHome() {
        return "home";
    }

    @RequestMapping("/animals")
    public String displayAllAnimalsInDatabase(Model model) {
        model.addAttribute("animalsList", animalRepo.findAll());
        return "allAnimalsView";
    }

    @RequestMapping("/animals/{commonName}")
    public String displayAnimalByCommonName(@PathVariable String commonName, Model model) {
        model.addAttribute("animal", animalRepo.findByCommonName(commonName));
        return "individualAnimalPageView";
    }





}
