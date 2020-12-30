package com.fgmammals.demo.Controllers;


import com.fgmammals.demo.Repositories.MammalRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class MammalController {


    @Resource
    private MammalRepository mammalRepo;


    @RequestMapping("/mammals")
    public String displayAllMammalsInDatabase(Model model) {
        model.addAttribute("mammalsList", mammalRepo.findAll());
        return "allMammalsView";
    }

    @RequestMapping("/mammals/{commonName}")
    public String displayMammalByCommonName(@PathVariable String commonName, Model model) {
        model.addAttribute("mammal", mammalRepo.findByCommonName(commonName));
        return "individualMammalPageView";
    }





}
