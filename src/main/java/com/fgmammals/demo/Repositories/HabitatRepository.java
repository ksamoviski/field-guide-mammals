package com.fgmammals.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

public interface HabitatRepository extends CrudRepository <Habitat, Long> {

    Habitat findByName (String name);

}
