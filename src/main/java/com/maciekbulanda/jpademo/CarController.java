package com.maciekbulanda.jpademo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
class CarController {
    private final CarService carService;

    @GetMapping
    Iterable<Car> getCars() {
        return carService.findAll();
    }

}
