package com.bmsti.recipecatalogapp.repositories;

import com.bmsti.recipecatalogapp.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UnitOfMeasureRepositoryIntegrationTest {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByDescription() {

        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        String description = null;
        if (unitOfMeasure.isPresent()) {
            description = unitOfMeasure.get().getDescription();
        }

        assertNotNull(description);
        assertEquals("Teaspoon", description);
    }
}