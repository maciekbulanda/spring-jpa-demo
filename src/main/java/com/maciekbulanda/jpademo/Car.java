package com.maciekbulanda.jpademo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
class Car {
    @Id
    private String regNo;
    private String brand;
    private String model;
    private double enginePower;
    @JsonBackReference
    @ManyToOne
    private Owner owner;
}
