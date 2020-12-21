package com.fgmammals.demo;


import com.fgmammals.demo.Models.Habitat;
import com.fgmammals.demo.Models.Mammal;
import com.fgmammals.demo.Repositories.HabitatRepository;
import com.fgmammals.demo.Repositories.MammalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.ArrayList;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    MammalRepository mammalRepo;

    @Resource
    HabitatRepository habitatRepo;

    @Override
    public void run(String... args) throws Exception {

        Habitat habitat = new Habitat("habitat");
        ArrayList<Habitat> habitats = new ArrayList<>();
        habitats.add(habitat);


        Mammal testMammal = new Mammal("cat");
        Mammal secondTest = new Mammal("species", "type", "describe", habitats, "repro", "know", "range", "tracks", "image");
        mammalRepo.save(testMammal);

        habitatRepo.save(habitat);

        }
}
