package com.fgmammals.demo.Repositories;

import com.fgmammals.demo.Models.Bird;
import org.springframework.data.repository.CrudRepository;

public interface BirdRepository extends CrudRepository<Bird, Long> {
}
