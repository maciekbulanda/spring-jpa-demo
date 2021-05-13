package com.maciekbulanda.jpademo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
class CarService {
    private final CarRepository carRepository;

    Iterable<Car> findAll() {
        return carRepository.findAll();
    }

    Optional<Car> findById(String id) {
        return carRepository.findById(id);
    }

    Car save(Car car) {
        return carRepository.save(car);
    }
}
