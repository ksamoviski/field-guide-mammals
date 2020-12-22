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

    @ManyToMany
    private Collection <Habitat> habitats;

    private String reproduction;
    private String didYouKnow;
    private String range;
    private String tracks;
    private String mainAnimalPicture;

    public Animal(String speciesOrder, String family, String species, String commonName, String description, Collection<Habitat> habitats, String reproduction, String didYouKnow, String range, String tracks, String mainAnimalPicture) {
        this.speciesOrder = speciesOrder;
        this.family = family;
        this.species = species;
        this.commonName = commonName;
        this.description = description;
        this.habitats = habitats;
        this.reproduction = reproduction;
        this.didYouKnow = didYouKnow;
        this.range = range;
        this.tracks = tracks;
        this.mainAnimalPicture = mainAnimalPicture;
    }

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

    public Collection<Habitat> getHabitats() {
        return habitats;
    }

    public String getReproduction() {
        return reproduction;
    }

    public String getDidYouKnow() {
        return didYouKnow;
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
