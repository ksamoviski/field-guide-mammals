package com.fgmammals.demo.Models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Animal {
    @Id
    @GeneratedValue
    private Long id;
    private String speciesOrder;
    private String family;
    private String species;
    private String commonName;

    private String description;
    private String reproduction;
    private String didYouKnow;

    @ManyToMany
    private Collection<Habitat> habitats;

    private String range;
    private String tracks;
    private String mainAnimalPicture;


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

    public String getReproduction() {
        return reproduction;
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

    public String getTracks() {
        return tracks;
    }

    public String getMainAnimalPicture() {
        return mainAnimalPicture;
    }

    public Animal() {
    }

    public Animal(String commonName, String speciesOrder, String family, String species, Collection<Habitat> habitats, String range, String tracks, String mainAnimalPicture) {
        this.commonName = commonName;
        this.speciesOrder = speciesOrder;
        this.family = family;
        this.species = species;

        this.description = "/textFiles/" + commonName + "Description.txt";
        this.reproduction = "/textFiles/" + commonName + "Reproduction.txt";
        this.didYouKnow = "/textFiles/" + commonName + "DYK.txt";

        this.habitats = habitats;
        this.range = range;
        this.tracks = tracks;
        this.mainAnimalPicture = mainAnimalPicture;
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
        Animal animal = (Animal) o;
        return id.equals(animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
