package com.fgmammals.demo.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mushroom extends LivingThing {

    @Id
    @GeneratedValue
    private Long id;

    public Mushroom(){
    }
}
