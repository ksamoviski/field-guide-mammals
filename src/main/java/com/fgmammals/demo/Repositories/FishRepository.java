package com.fgmammals.demo.Repositories;

import com.fgmammals.demo.Models.Fish;
import org.springframework.data.repository.CrudRepository;

public interface FishRepository extends CrudRepository<Fish, Long> {
    Fish findByCommonName(String commonName);
}
