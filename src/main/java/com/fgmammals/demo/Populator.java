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

        Animal virginiaOpossum = new Animal("didelphimorphia", "DIDELPHIDAE", "DIDELPHIS VIRGINIANA", "Virginia-Opossum", "/textFiles/virginiaOpossumDescription.txt", opossumHabitats, "/textFiles/VirginiaOpossumReproduce.txt",
               "/textFiles/virginiaOpossumDYK.txt","place holder for range photo","place holder for tracks image", "placeholder for main picture");
        Animal easternChipmunk = new Animal("Rodentia", "Sciuridae", "Tamias Striatus", "Eastern-Chipmunk", "/textFiles/EasternChipmunkDescription.txt",
                opossumHabitats, "/textFiles/EasternChipmunkReproduce.txt", "/textFiles/EasternChipmunkDYK.txt", "range photo here", "tracks here",
                "photo here");
        Animal easternGraySquirrel = new Animal("Rodentia", "Sciuridae", "Sciur Us Carolinensis", "Eastern-Gray-Squirrel",
                "/textFiles/EasternGraySquirrelDescription.txt",
                opossumHabitats, "/textFiles/EasternGraySquirrelReproduce.txt", "/textFiles/EasternGraySquirrelDYK.txt", "range photo here", "tracks here",
                "photo here");
        Animal thirteenLinedSquirrel = new Animal("Rodentia", "Sciuridae", "Sper Mophilus Tridecemlineatus",
                "Thirteen-Lined-Ground-Squirrel", "/textFiles/13LinedSquirrelDescription.txt",
                opossumHabitats, "/textFiles/13LinedSquirrelReproduce.txt", "/textFiles/13LinedSquirrelDYK.txt", "range photo here", "tracks here",
                "photo here");


        habitatRepo.save(wetLands);
        animalRepo.save(virginiaOpossum);
        animalRepo.save(easternChipmunk);
        animalRepo.save(easternGraySquirrel);
        animalRepo.save(thirteenLinedSquirrel);





    }
}
