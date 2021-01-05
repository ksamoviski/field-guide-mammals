package com.fgmammals.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private Long id;

    private String locationName;
    private String address;





}
