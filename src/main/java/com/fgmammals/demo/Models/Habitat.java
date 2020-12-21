package com.fgmammals.demo.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Habitat {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany
    private Collection<Mammal> mammals;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Mammal> getMammals() {
        return mammals;
    }

    public Habitat(String name) {
        this.name = name;
    }

    public Habitat(){

    }
}
