package com.fgmammals.demo.Repositories;

import com.fgmammals.demo.Models.Entry;
import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry, Long> {

    Entry findByTitle(String title);

}
