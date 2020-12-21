package com.fgmammals.demo;


import com.fgmammals.demo.Models.Animal;
import com.fgmammals.demo.Models.Habitat;
import com.fgmammals.demo.Repositories.AnimalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private AnimalRepository animalRepo;
    @Override
    public void run(String... args) throws Exception {
        Habitat wetLands = new Habitat("wetlands");
        String virginiaOpossumDescription = "An adult is about the size of a house cat, with coarse, grizzled, grayish fur. It has a long, scaly tail, ears without fur, and a long, pointed snout that ends in a pink nose. Quite adaptable and can be found in suburbia and the city. Ideal habitat, however, is an area with woods, wetlands, and farmland interspersed.";
        String virginiaOpossumReproduction = "A female opossum carries 12-13 young internally for approximately two weeks before they are born. Opossums are undeveloped and tiny (1/15 ounce) at birth. The offspring must crawl to a teat in the female’s pouch to survive. At about three months of age, young opossums emerge from the pouch for short periods and will hitch a ride on the adult female’s back to get from place to place.";
        String virginiaOpossumDidYouKnow = "The opossum “plays dead” when frightened, by essentially passing out when confronted with danger. This technique usually causes the predator to lose interest and wander off. Then the opossum wakes up a short time later and goes about its business.";
        Animal virginiaOpossum = new Animal("didelphimorphia", "DIDELPHIDAE", "DIDELPHIS VIRGINIANA", "Virginia Opossum", virginiaOpossumDescription, wetLands, virginiaOpossumReproduction,
                virginiaOpossumDidYouKnow,"place holder for range photo","place holder for tracks image", "placeholder for main picture");

    }
}
