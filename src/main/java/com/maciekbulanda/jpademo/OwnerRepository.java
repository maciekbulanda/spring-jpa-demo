package com.maciekbulanda.jpademo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

interface OwnerRepository extends CrudRepository<Owner, Integer> {
    Optional<Owner> findOwnerByName(String name);
}
