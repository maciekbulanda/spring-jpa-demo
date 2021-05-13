package com.maciekbulanda.jpademo;

import org.springframework.data.repository.CrudRepository;

interface OwnerRepository extends CrudRepository<Owner, Integer> {
}
