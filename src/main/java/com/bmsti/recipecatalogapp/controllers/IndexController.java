package com.bmsti.recipecatalogapp.controllers;

import com.bmsti.recipecatalogapp.domain.Category;
import com.bmsti.recipecatalogapp.domain.UnitOfMeasure;
import com.bmsti.recipecatalogapp.repositories.CategoryRepository;
import com.bmsti.recipecatalogapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author angelo santos
 * @version 1.0
 * @since 17/08/2020
 */
@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping(value = {"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findAllByDescription("Teaspoon");

        System.out.println("Category Id is: ".concat(category.map(c -> c.getId().toString()).orElse("")));
        System.out.println("Unit Of Measure Id is: ".concat(unitOfMeasure.map(u -> u.getId().toString()).orElse("")));

        return "index";
    }
}
