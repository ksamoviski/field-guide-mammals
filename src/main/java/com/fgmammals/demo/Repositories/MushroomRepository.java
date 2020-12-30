package com.fgmammals.demo.Repositories;

import com.fgmammals.demo.Models.Mushroom;
import org.springframework.data.repository.CrudRepository;

public interface MushroomRepository extends CrudRepository<Mushroom, Long> {
    Mushroom findByCommonName(String commonName);
}
