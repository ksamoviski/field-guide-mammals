package com.fgmammals.demo.Models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class LivingThing {
    @Id
    @GeneratedValue
    private Long id;

    private String commonName;
    private String imageTitle;
    private String category;
    private String description;

    public LivingThing(String commonName, String category, String description) {
        this.commonName = commonName;
        this.category = category;
        this.description = description;
    }

    public LivingThing(String commonName, String imageTitle, String category, String description) {
        this.commonName = commonName;
        this.imageTitle = imageTitle;
        this.category = category;
        this.description = description;
    }

    public LivingThing(String commonName, String category) {
        this.commonName = commonName;
        this.category = category;
    }

    public LivingThing(){

    }

    public Long getId() {
        return id;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivingThing livingThing = (LivingThing) o;
        return id.equals(livingThing.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
