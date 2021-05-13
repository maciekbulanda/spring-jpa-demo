package com.maciekbulanda.jpademo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
class Owner {
    @Id
    private Integer id;
    private String name;
    @OneToMany
    private Set<Car> cars = new HashSet<>();
}
