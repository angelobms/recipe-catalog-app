package com.bmsti.recipecatalogapp.repositories;

import com.bmsti.recipecatalogapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author angelo santos
 * @version 1.0
 * @since 17/08/2020
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
