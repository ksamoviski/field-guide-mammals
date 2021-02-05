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
import java.util.ArrayList;
import java.util.Collection;

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

        Collection<String> notes = new ArrayList<>();
        notes.add("notes will be here");

        Observation observation1 = new Observation(bird, location, "Season", "Habitat", notes);
        Observation observation2 = new Observation(tree, location, "Season", "Habitat", notes);
        Observation observation3 = new Observation(mushroom, location, "Season", "Habitat", notes);


        Entry entry1 = new Entry("Title One", observation1);
        Entry entry2= new Entry("Title Two", observation2);
        Entry entry3 = new Entry("Title Three", observation3);

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
