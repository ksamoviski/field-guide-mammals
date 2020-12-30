package com.fgmammals.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Plant extends LivingThing{

    @Id
    @GeneratedValue
    private Long id;

    public Plant(){
    }

    public Plant(String commonName, String speciesOrder, String family, String species, Collection<Habitat> habitats, String range, String image) {
        super(commonName, speciesOrder, family, species, habitats, range, image);
    }
}
