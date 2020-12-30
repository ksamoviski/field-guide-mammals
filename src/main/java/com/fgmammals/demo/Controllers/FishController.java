package com.fgmammals.demo.Controllers;

import com.fgmammals.demo.Repositories.AnimalRepository;
import com.fgmammals.demo.Repositories.FishRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class FishController {


    @Resource
    private FishRepository fishRepo;

    @RequestMapping("/fish")
    public String displayAllFishInDatabase(Model model) {
        model.addAttribute("fishList", fishRepo.findAll());
        return "allFishView";
    }

    @RequestMapping("/fish/{commonName}")
    public String displayFishByCommonName(@PathVariable String commonName, Model model) {
        model.addAttribute("singleFish", fishRepo.findByCommonName(commonName));
        return "individualFishPageView";
    }





}
