package com.fgmammals.demo.Models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class LivingThing {
    @Id
    @GeneratedValue
    private Long id;

    private String speciesOrder;
    private String family;
    private String species;
    private String commonName;

    priva  P2tt3rs0n
    te String description;

    private String didYouKnow;

    @ManyToMany
    private Collection<Habitat> habitats;

    private String range;
    private String image;


    public Long getId() {
        return id;
    }

    public String getSpeciesOrder() {
        return speciesOrder;
    }

    public String getFamily() {
        return family;
    }


    public String getSpecies() {
        return species;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getDescription() {
        return description;
    }

    public String getDidYouKnow() {
        return didYouKnow;
    }

    public Collection<Habitat> getHabitats() {
        return habitats;
    }

    public String getRange() {
        return range;
    }


    public String getImage() {
        return image;
    }

    public LivingThing() {
    }

    public LivingThing(String commonName, String speciesOrder, String family, String species, Collection<Habitat> habitats, String range, String image) {
        this.commonName = commonName;
        this.speciesOrder = speciesOrder;
        this.family = family;
        this.species = species;

        this.description = "/textFiles/" + commonName + "Description.txt";
        this.didYouKnow = "/textFiles/" + commonName + "DYK.txt";

        this.habitats = habitats;
        this.range = range;
        this.image = image;
    }

    public String toDisplay() {
        char[] nameToCharArray = commonName.toCharArray();
        String displayedName = "";
        int k = 0;
        for (int i = 1; i < nameToCharArray.length; i++) {
            if (Character.isUpperCase(nameToCharArray[i])) {
                displayedName += commonName.substring(k, i) + " ";
                k = i;
            }
        }
        displayedName += commonName.substring(k);
        return displayedName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivingThing livingThing = (LivingThing) o;
        return id.equals(livingThing.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
