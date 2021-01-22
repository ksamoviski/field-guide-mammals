package com.fgmammals.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, Long> {
    Plant findByCommonName(String commonName);
}