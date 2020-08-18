package com.bmsti.recipecatalogapp.repositories;

import com.bmsti.recipecatalogapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author angelo santos
 * @version 1.0
 * @since 17/08/2020
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
