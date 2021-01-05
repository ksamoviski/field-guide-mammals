package com.fgmammals.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

public interface MushroomRepository extends CrudRepository<Mushroom, Long> {
    Mushroom findByCommonName(String commonName);
}
