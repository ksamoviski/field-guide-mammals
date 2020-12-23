package com.fgmammals.demo;


import com.fgmammals.demo.Models.Animal;
import com.fgmammals.demo.Models.Description;
import com.fgmammals.demo.Models.Habitat;
import com.fgmammals.demo.Repositories.AnimalRepository;
import com.fgmammals.demo.Repositories.HabitatRepository;
import javassist.runtime.Desc;
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


        Animal virginiaOpossum = new Animal("VirginiaOpossum","didelphimorphia", "DIDELPHIDAE", "DIDELPHIS VIRGINIANA", opossumHabitats,"place holder for range photo","place holder for tracks image", "placeholder for main picture");
        Animal easternChipmunk = new Animal("EasternChipmunk", "Rodentia", "Sciuridae", "Tamias Striatus",
                opossumHabitats, "range photo here", "tracks here",
                "photo here");
        Animal easternGraySquirrel = new Animal("EasternGraySquirrel", "Rodentia", "Sciuridae", "Sciur Us Carolinensis" ,
                opossumHabitats, "range photo here", "tracks here",
                "photo here");
        Animal thirteenLinedSquirrel = new Animal("13LinedGroundSquirrel", "Rodentia", "Sciuridae", "Sper Mophilus Tridecemlineatus",
                opossumHabitats,"range photo here", "tracks here",
                "photo here");


        habitatRepo.save(wetLands);
        animalRepo.save(virginiaOpossum);
        animalRepo.save(easternChipmunk);
        animalRepo.save(easternGraySquirrel);
        animalRepo.save(thirteenLinedSquirrel);







    }
}
