package com.fgmammals.demo;


import com.fgmammals.demo.Models.*;
import com.fgmammals.demo.Repositories.AnimalRepository;
import com.fgmammals.demo.Repositories.HabitatRepository;
import com.fgmammals.demo.Repositories.LivingThingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private LivingThingRepository livingThingRepo;
    @Resource
    private AnimalRepository animalRepo;
    @Resource
    private HabitatRepository habitatRepo;

    @Override
    public void run(String... args) throws Exception {
        Habitat wetLands = new Habitat("wetlands");
        ArrayList<Habitat> opossumHabitats = new ArrayList<>();
        opossumHabitats.add(wetLands);


        Mammal virginiaOpossum = new Mammal("VirginiaOpossum", "Rodentia","Didelphimorphia", "Didelphis virginiana", opossumHabitats, "range", "image", "tracks");
        Mammal easternChipmunk = new Mammal("EasternChipmunk", "Rodentia", "Sciuridae", "Tamias striatus",
                opossumHabitats, "range photo here", "tracks here",
                "photo here");
        Mammal easternGraySquirrel = new Mammal("EasternGraySquirrel", "Rodentia", "Sciuridae", "Sciurus carolinensis",
                opossumHabitats, "range photo here", "tracks here",
                "photo here");
        Mammal thirteenLinedSquirrel = new Mammal("13LinedGroundSquirrel", "Rodentia", "Sciuridae", "Spermophilus tridecemlineatus",
                opossumHabitats, "range photo here", "tracks here",
                "photo here");
        Mammal easternFoxSquirrel = new Mammal("EasternFoxSquirrel", "Rodentia", "Sciuridae", "Sciurus niger",
                opossumHabitats, "range", "tracks", "photo");
        Mammal redSquirrel = new Mammal("RedSquirrel", "Rodentia", "Sciuridae", "Tamiasciurus hudsonicus",
                opossumHabitats, "range", "tracks", "photo");
        Mammal americanBeaver = new Mammal("AmericanBeaver", "Rodentia", "Castoridae", "Tamiasciurus hudsonicus",
                opossumHabitats, "range", "tracks", "photo");
        Mammal woodchuck = new Mammal("Woodchuck", "Rodentia", "Sciuridae", "Marmota monax",
                opossumHabitats, "range", "tracks", "photo");
        Mammal southernFlyingSquirrel = new Mammal("SouthernFlyingSquirrel", "Rodentia", "Sciuridae", "Glaucomys volans",
                opossumHabitats, "range", "tracks", "photo");

        Tree americanBeech = new Tree("AmericanBeech", "Fagales", "Fagaceae", "Fagus grandifolia", opossumHabitats, "range", "photo");


        habitatRepo.save(wetLands);
        livingThingRepo.save(virginiaOpossum);
        livingThingRepo.save(easternChipmunk);
        livingThingRepo.save(easternGraySquirrel);
        livingThingRepo.save(thirteenLinedSquirrel);
        livingThingRepo.save(easternFoxSquirrel);
        livingThingRepo.save(redSquirrel);
        livingThingRepo.save(americanBeaver);
        livingThingRepo.save(woodchuck);
        livingThingRepo.save(southernFlyingSquirrel);
        livingThingRepo.save(americanBeech);

    }
}
