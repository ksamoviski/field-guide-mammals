package com.fgmammals.demo.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Mammal extends Animal {

    @Id
    @GeneratedValue
    private Long id;

    private String reproduction;
    private String tracks;



    public String getTracks() {
        return tracks;
    }

    public String getReproduction() {
        return reproduction;
    }

    public Mammal() {
    }

    public Mammal(String commonName, String speciesOrder, String family, String species, Collection<Habitat> habitats, String range, String image, String tracks) {
        super(commonName, speciesOrder, family, species, habitats, range, image);

        this.reproduction = "/textFiles/" + commonName + "Reproduction.txt";
        this.tracks = tracks;
    }

}
