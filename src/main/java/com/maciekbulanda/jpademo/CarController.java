package com.maciekbulanda.jpademo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
class CarController {
    private final CarService carService;

    @GetMapping
    Iterable<Car> getCars() {
        return carService.findAll();
    }

    @PostMapping
    Car newCar(@RequestBody Car car, @RequestParam String owner) {
        return carService.save(car);
    }

    @GetMapping("/{reg}")
    Iterable<Car> getCarByReg(@PathVariable String reg) {
//        return carService.findById(reg).orElse(null);
        return carService.findByReg(reg);
    }

}
