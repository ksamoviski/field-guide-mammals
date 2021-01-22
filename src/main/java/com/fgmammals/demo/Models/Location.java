package com.fgmammals.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private Long id;
    private String locationName;
    private String address;

    @OneToMany (mappedBy = "location")
    private Collection<Observation> observations;

    public Long getId() {
        return id;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getAddress() {
        return address;
    }

    public Collection<Observation> getObservations() {
        return observations;
    }


    public Location(){
    }

    public Location(String locationName){
        this.locationName = locationName;
    }


}
