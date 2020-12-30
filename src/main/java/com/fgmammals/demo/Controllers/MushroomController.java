package com.fgmammals.demo.Controllers;


import com.fgmammals.demo.Repositories.MushroomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class MushroomController {


    @Resource
    private MushroomRepository mushroomRepo;

    @RequestMapping("/mushrooms")
    public String displayAllMushroomsInDatabase(Model model) {
        model.addAttribute("mushroomsList", mushroomRepo.findAll());
        return "allMushroomsView";
    }

    @RequestMapping("/mushrooms/{commonName}")
    public String displayMushroomByCommonName(@PathVariable String commonName, Model model) {
        model.addAttribute("mushroom", mushroomRepo.findByCommonName(commonName));
        return "individualMushroomPageView";
    }





}
