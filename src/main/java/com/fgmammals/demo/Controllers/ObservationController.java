package com.fgmammals.demo.Controllers;


import com.fgmammals.demo.Models.LivingThing;
import com.fgmammals.demo.Models.Location;
import com.fgmammals.demo.Models.Observation;
import com.fgmammals.demo.Repositories.LivingThingRepository;
import com.fgmammals.demo.Repositories.LocationRepository;
import com.fgmammals.demo.Repositories.ObservationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@Controller
public class ObservationController {

    @Resource
    private ObservationRepository observationRepo;

    @Resource
    private LocationRepository locationRepo;

    @Resource
    private LivingThingRepository livingThingRepo;

    @RequestMapping("/observation")
    public String displayAllObservationsInDatabase(Model model) {
        model.addAttribute("observationsList", observationRepo.findAll());
        return "addObservation";
    }

    @PostMapping("/add-observation")
    public void addObservationToRepository(@RequestBody Observation observation) {

        Location location = new Location();
        LivingThing livingThing = new LivingThing();

        String locationName = observation.getLocation().getLocationName();
        String livingThingName = observation.getLivingThing().getCommonName();
        String season = observation.getSeason();
        String description = observation.getDescription();
        Collection<String> habitatsForObservation = observation.getHabitats();

        Optional<Location> foundLocation = Optional.ofNullable(locationRepo.findByLocationName(locationName));
        Optional<LivingThing> foundLivingThing = Optional.ofNullable(livingThingRepo.findByCommonName(livingThingName));

        if (foundLocation.isEmpty()) {
            location = new Location(locationName);
            locationRepo.save(location);
        }
        if (foundLivingThing.isEmpty()) {
            livingThing = new LivingThing(livingThingName);
            livingThingRepo.save(livingThing);
        }

        Observation observationToAdd = new Observation(livingThing, location, season, description, habitatsForObservation);
        observationRepo.save(observationToAdd);
    }

    @RequestMapping("/camera-testing-page")
    public String displayAddPhotoPage() {
        return "cameraTestPage";
    }



}
