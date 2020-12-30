package com.fgmammals.demo.Repositories;

import com.fgmammals.demo.Models.LivingThing;
import org.springframework.data.repository.CrudRepository;

public interface LivingThingRepository extends CrudRepository<LivingThing, Long> {
    LivingThing findByCommonName(String commonName);
}
