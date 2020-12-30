package com.fgmammals.demo.Controllers;


import com.fgmammals.demo.Repositories.AnimalRepository;
import com.fgmammals.demo.Repositories.InsectRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class InsectController {

    @Resource
    private InsectRepository insectRepo;

    @RequestMapping("/insects")
    public String displayAllInsectsInDatabase(Model model) {
        model.addAttribute("insectsList", insectRepo.findAll());
        return "allInsectsView";
    }

    @RequestMapping("/insects/{commonName}")
    public String displayInsectByCommonName(@PathVariable String commonName, Model model) {
        model.addAttribute("insect", insectRepo.findByCommonName(commonName));
        return "individualInsectPageView";
    }





}
