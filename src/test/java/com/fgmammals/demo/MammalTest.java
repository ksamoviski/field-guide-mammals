package com.fgmammals.demo;


import com.fgmammals.demo.Models.Mammal;
import com.fgmammals.demo.Repositories.MammalRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class MammalTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private MammalRepository testMammalRepo;



    @Test
    public void mammalsShouldExist() {
        Mammal testMammal1 = new Mammal();
        Mammal testMammalType = new Mammal("Bear");
        testMammalRepo.save(testMammal1);
        testMammalRepo.save(testMammalType);

        entityManager.flush();
        entityManager.clear();

        Mammal testMammal2 = testMammalRepo.findById(testMammal1.getId()).get();

        assertEquals(testMammal2,testMammal1);
        assertEquals(testMammalType,testMammalRepo.findByType("Bear"));
    }
}

