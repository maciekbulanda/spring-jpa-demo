package com.maciekbulanda.jpademo;

import org.springframework.data.repository.CrudRepository;

interface CarRepository extends CrudRepository<Car, String> {
    Iterable<Car> findCarByRegNoContaining(String reg);
}
