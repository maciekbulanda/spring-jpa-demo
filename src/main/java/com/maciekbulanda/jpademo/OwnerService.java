package com.maciekbulanda.jpademo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
class OwnerService {
    private final OwnerRepository ownerRepository;

    Iterable<Owner> findAll() {
        return ownerRepository.findAll();
    }

    Optional<Owner> findById(int id) {
        return ownerRepository.findById(id);
    }

    Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }
}
