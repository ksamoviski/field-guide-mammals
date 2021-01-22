package com.fgmammals.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

public interface MammalRepository extends CrudRepository<Mammal, Long> {
    Mammal findByCommonName(String commonName);
}
