package com.fgmammals.demo.Models;

import com.sun.istack.FinalArrayList;

import javax.persistence.*;
import java.time.LocalDate;

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
    private String habitat;
    private String description;


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

    public String getHabitat() {
        return habitat;
    }

    public String getNotes() {
        return description;
    }

    public Entry getEntry(){
        return entry;
    }

    public Observation(){
    }


    public Observation(LivingThing livingThing, Location location, String season, String habitat, String description) {
        this.livingThing = livingThing;
        this.location = location;
        this.season = season;
        this.habitat = habitat;
        this.description = description;
    }

}
