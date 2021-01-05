package com.fgmammals.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository <Animal, Long> {

    Animal findByCommonName(String commonName);




}
