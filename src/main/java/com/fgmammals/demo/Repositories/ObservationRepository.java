package com.fgmammals.demo.Repositories;

import com.fgmammals.demo.Models.LivingThing;
import com.fgmammals.demo.Models.Observation;
import org.springframework.data.repository.CrudRepository;

public interface ObservationRepository extends CrudRepository<Observation, Long> {
    Observation findByLivingThing(LivingThing livingThing);

}
