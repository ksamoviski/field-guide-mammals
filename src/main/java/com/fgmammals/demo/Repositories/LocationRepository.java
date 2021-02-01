package com.fgmammals.demo.Repositories;

import com.fgmammals.demo.Models.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository <Location,Long> {
}
