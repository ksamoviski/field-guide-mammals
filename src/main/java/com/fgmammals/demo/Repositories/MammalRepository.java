package com.fgmammals.demo.Repositories;

import com.fgmammals.demo.Models.Mammal;
import org.springframework.data.repository.CrudRepository;

public interface MammalRepository extends CrudRepository <Mammal, Long> {

    Mammal findByType(String type);


}
