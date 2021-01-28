package com.fgmammals.demo;

import com.fgmammals.demo.Models.Entry;
import com.fgmammals.demo.Models.LivingThing;
import com.fgmammals.demo.Models.Location;
import com.fgmammals.demo.Models.Observation;
import com.fgmammals.demo.Repositories.EntryRepository;
import com.fgmammals.demo.Repositories.LivingThingRepository;
import com.fgmammals.demo.Repositories.LocationRepository;
import com.fgmammals.demo.Repositories.ObservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    EntryRepository entryRepository;

    @Resource
    LivingThingRepository livingThingRepository;

    @Resource
    ObservationRepository observationRepository;

    @Resource
    LocationRepository locationRepository;

    @Override
    public void run(String...args)throws Exception{

        LivingThing bird = new LivingThing("Name", "Birds");
        LivingThing tree = new LivingThing("Oak", "Plants & Trees");
        LivingThing mushroom = new LivingThing("morel", "Fungus");

        Location location = new Location("Alumn Creek");

        Observation observation1 = new Observation(bird, location, "Season", "Habitat", "Notes");
        Observation observation2 = new Observation(tree, location, "Season", "Habitat", "Notes");
        Observation observation3 = new Observation(mushroom, location, "Season", "Habitat", "Notes");


        Entry entry1 = new Entry("Title", observation1);
        Entry entry2= new Entry("Title", observation2);
        Entry entry3 = new Entry("Title", observation3);

        livingThingRepository.save(bird);
        livingThingRepository.save(tree);
        livingThingRepository.save(mushroom);

        locationRepository.save(location);

        observationRepository.save(observation1);
        observationRepository.save(observation2);
        observationRepository.save(observation3);


        entryRepository.save(entry1);
        entryRepository.save(entry2);
        entryRepository.save(entry3);

    }



}
