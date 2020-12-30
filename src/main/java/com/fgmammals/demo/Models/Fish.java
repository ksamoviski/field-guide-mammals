package com.fgmammals.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Fish extends Animal{

    @Id
    @GeneratedValue
    private Long id;

    public Fish(){
    }

    public Fish(String commonName, String speciesOrder, String family, String species, Collection<Habitat> habitats, String range, String image) {
        super(commonName, speciesOrder, family, species, habitats, range, image);
    }
}
