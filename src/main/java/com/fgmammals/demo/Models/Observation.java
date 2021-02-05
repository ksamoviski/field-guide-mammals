package com.fgmammals.demo.Models;

import com.sun.istack.FinalArrayList;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Observation {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private LivingThing livingThing;

    @ManyToOne
    private Location location;

    @ManyToOne
    private Entry entry;

    private String season;

    @Transient
    private Collection<String> habitats;
    private String description;
    private LocalDate timeOfObservation;


    public Long getId() {
        return id;
    }

    public LivingThing getLivingThing() {
        return livingThing;
    }

    public Location getLocation() {
        return location;
    }

    public String getSeason() {
        return season;
    }

    public Collection<String> getHabitats() {
        return habitats;
    }

    public String getDescription() {
        return description;
    }

    public Entry getEntry(){
        return entry;
    }

    public Observation(){
    }


    public Observation(LivingThing livingThing, Location location, String season, String description, Collection<String> habitats) {
        this.livingThing = livingThing;
        this.location = location;
        this.season = season;
        this.habitats = habitats;
        this.description = description;
        this.timeOfObservation = LocalDate.now();
    }

}
