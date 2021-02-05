package com.fgmammals.demo.Controllers;

import com.fgmammals.demo.Models.Location;
import com.fgmammals.demo.Repositories.LocationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.Optional;

@CrossOrigin
@Controller
public class LocationController {

    @Resource
    LocationRepository locationRepo;

    @GetMapping("/all-locations")
    public String displayAllLocationsInRepo(Model model) {
        model.addAttribute("allLocations", locationRepo.findAll());
        model.addAttribute("howMany", locationRepo.count());
        return "allLocations";
    }


    @PostMapping("/add-location")
    public void addLocationToRepository(@RequestBody Location location) {

        Optional<Location> foundLocation = Optional.ofNullable(locationRepo.findByLocationName(location.getLocationName()));

        if (foundLocation.isEmpty()) {
            Location locationToAdd = new Location(location.getLocationName());
            locationRepo.save(locationToAdd);
        }
    }
}
