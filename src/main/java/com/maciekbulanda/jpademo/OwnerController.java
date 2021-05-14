package com.maciekbulanda.jpademo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/owner")
@RequiredArgsConstructor
class OwnerController {
    private final OwnerService ownerService;

    @GetMapping
    Iterable<Owner> getAllOwners() {
        return ownerService.findAll();
    }

    @GetMapping("/{name}")
    Owner getOwnerByName(@PathVariable String name) {
        return ownerService.findByName(name).orElse(null);
    }
}
