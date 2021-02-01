package com.fgmammals.demo.Controllers;

import com.fgmammals.demo.Repositories.EntryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class EntryController {

    @Resource
    private EntryRepository entryRepo;


    @RequestMapping("/home")
    public String displayHomePage(Model model) {
        model.addAttribute("home", entryRepo.findAll());
        return "home";
    }


    @RequestMapping("/entries")
    public String displayEntriesPage(Model model) {
        model.addAttribute("entries", entryRepo.findAll());
        return "entriesView";
    }

    @RequestMapping("/add-entry")
    public String displayAddEntryPage(Model model) {
        model.addAttribute("addEntry", entryRepo.findAll());
        return "addEntryView";
    }

//    @RequestMapping("/all-entries")
//    public String displayAllEntriesPage(Model model) {
//        model.addAttribute("addEntry", entryRepo.findAll());
//        return "addEntryView";
//
//    }

}
