package com.fgmammals.demo.Models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Animal extends LivingThing {
    @Id
    @GeneratedValue
    private Long id;



    public Animal() {
    }

    public Animal(String commonName, String speciesOrder, String family, String species, Collection<Habitat> habitats, String range, String image) {
        super(commonName, speciesOrder, family, species, habitats, range, image);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id.equals(animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
