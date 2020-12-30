package com.fgmammals.demo.Repositories;

import com.fgmammals.demo.Models.Insect;
import org.springframework.data.repository.CrudRepository;

public interface InsectRepository extends CrudRepository<Insect, Long> {

    Insect findByCommonName(String commonName);
}
