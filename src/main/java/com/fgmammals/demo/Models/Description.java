package com.fgmammals.demo.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Description {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private String didYouKnow;
    private String reproduction;






}
