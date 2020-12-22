package com.fgmammals.demo;


import com.fgmammals.demo.Models.Animal;
import com.fgmammals.demo.Models.Habitat;
import com.fgmammals.demo.Repositories.AnimalRepository;
import com.fgmammals.demo.Repositories.HabitatRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private AnimalRepository animalRepo;
    @Resource
    private HabitatRepository habitatRepo;

    @Override
    public void run(String... args) throws Exception {
        Habitat wetLands = new Habitat("wetlands");
        ArrayList<Habitat> opossumHabitats=new ArrayList<>();
        opossumHabitats.add(wetLands);
        String virginiaOpossumDescription = "A description";
        String virginiaOpossumReproduction = "some reproduction";
        String virginiaOpossumDidYouKnow = "randomFact";
        Animal virginiaOpossum = new Animal("didelphimorphia", "DIDELPHIDAE", "DIDELPHIS VIRGINIANA", "name", virginiaOpossumDescription, opossumHabitats, virginiaOpossumReproduction,
                virginiaOpossumDidYouKnow,"place holder for range photo","place holder for tracks image", "placeholder for main picture");
        habitatRepo.save(wetLands);
        animalRepo.save(virginiaOpossum);

    }
}
