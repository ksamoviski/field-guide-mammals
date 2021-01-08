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


    @RequestMapping("/entries")
        public String displayEntriesPage(Model model) {
        model.addAttribute("entries", entryRepo.findAll());
        return "allEntriesView";
        }

    @RequestMapping("/add-entry")
    public String displayaddEntryPage(){
        return "addEntryView";
    }

}
