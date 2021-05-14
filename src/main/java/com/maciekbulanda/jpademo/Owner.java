package com.maciekbulanda.jpademo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
class Owner {
    @Id
    private Integer id;
    private String name;
    @JsonManagedReference
    @OneToMany(mappedBy = "owner")
    private List<Car> cars;
}
