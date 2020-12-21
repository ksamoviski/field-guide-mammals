package com.fgmammals.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public abstract class Mammal {
    @Id
    @GeneratedValue
    private Long id;
    private String species;
    private String type;
    private String description;

    @ManyToOne
    private Habitat habitat;

    private String reproduction;
    private String didYouKnow;
    private String range;
    private String tracks;
    private String mainMammalPicture;

    public Mammal(String species, String type, String description, Habitat habitat, String reproduction, String didYouKnow, String range, String tracks, String mainMammalPicture) {
        this.species = species;
        this.type = type;
        this.description = description;
        this.habitat = habitat;
        this.reproduction = reproduction;
        this.didYouKnow = didYouKnow;
        this.range = range;
        this.tracks = tracks;
        this.mainMammalPicture = mainMammalPicture;
    }

    public Long getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Habitat getHabitat() {
        return habitat;
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

    public String getMainMammalPicture() {
        return mainMammalPicture;
    }

    public Mammal(String type) {
        this.type = type;
    }

    public Mammal() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammal mammal = (Mammal) o;
        return id.equals(mammal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
