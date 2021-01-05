package com.fgmammals.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Entry {

    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @OneToMany(mappedBy = "entry")
    private Collection<Observation> observations;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Collection<Observation> getObservations() {
        return observations;
    }

    public Entry(){
    }

    public Entry(String title, Observation...observations){
        this.title = title;
        this.observations = Arrays.asList(observations);
    }


}
