package com.maciekbulanda.jpademo;

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
    @ManyToOne
    private Owner owner;
}
