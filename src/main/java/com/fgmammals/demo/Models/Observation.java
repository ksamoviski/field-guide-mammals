package com.fgmammals.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Observation {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    private LocalDate date;
    private int season;
    private int habitat;

    @OneToOne
    private LivingThing livingThing;
    private String notes;


    public Long getId() {
        return id;
    }
    public String getLocation() {
        return location;
    }
    public LocalDate getDate() {
        return date;
    }
    public int getSeason() {
        return season;
    }
    public int getHabitat() {
        return habitat;
    }
    public LivingThing getLivingThing() {
        return livingThing;
    }

    public String getNotes() {
        return notes;
    }


    public Observation(String location, LocalDate date, int season, int habitat, LivingThing livingThing, String notes) {
        this.location = location;
        this.date = date;
        this.season = season;
        this.habitat = habitat;
        this.livingThing = livingThing;
        this.notes = notes;
    }

    public Observation(){
    }

}
