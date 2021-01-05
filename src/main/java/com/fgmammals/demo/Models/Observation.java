package com.fgmammals.demo.Models;

import com.sun.istack.FinalArrayList;

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

    @OneToOne
    private LivingThing livingThing;

    private String location;
    private LocalDate date;
    private String season;
    private String habitat;
    private String notes;


    public Long getId() {
        return id;
    }

    public LivingThing getLivingThing() {
        return livingThing;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSeason() {
        return season;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getNotes() {
        return notes;
    }

    public Observation(){

    }


    public Observation(LivingThing livingThing, String location, LocalDate date, String season, String habitat, String notes) {
        this.livingThing = livingThing;
        this.location = location;
        this.date = date;
        this.season = season;
        this.habitat = habitat;
        this.notes = notes;
    }

}
