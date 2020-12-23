package com.fgmammals.demo.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Description {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private String didYouKnow;
    private String reproduction;

//    @OneToOne
//    private Animal animal;


    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDidYouKnow() {
        return didYouKnow;
    }

    public String getReproduction() {
        return reproduction;
    }

//    public Animal getAnimal() {
//        return animal;
//    }

    public Description() {
    }

    public Description(String description, String didYouKnow, String reproduction) {
        this.description = "/textFiles/" + description;
        this.reproduction = reproduction;
        this.didYouKnow = didYouKnow;
    }

//    /textFiles/VirginiaOpossumDescription.txt









}
