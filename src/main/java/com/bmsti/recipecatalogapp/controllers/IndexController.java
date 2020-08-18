package com.bmsti.recipecatalogapp.controllers;

import com.bmsti.recipecatalogapp.domain.Category;
import com.bmsti.recipecatalogapp.domain.UnitOfMeasure;
import com.bmsti.recipecatalogapp.repositories.CategoryRepository;
import com.bmsti.recipecatalogapp.repositories.UnitOfMeasureRepository;
import com.bmsti.recipecatalogapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author angelo santos
 * @version 1.0
 * @since 17/08/2020
 */
@Controller
public class IndexController {

//  private final CategoryRepository categoryRepository;
//  private final UnitOfMeasureRepository unitOfMeasureRepository;
    private final RecipeService recipeService;

//  public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
//      this.categoryRepository = categoryRepository;
//      this.unitOfMeasureRepository = unitOfMeasureRepository;
//  }

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = {"", "/", "/index"})
    public String getIndexPage(Model model) {

//      Optional<Category> category = categoryRepository.findByDescription("American");
//      Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findAllByDescription("Teaspoon");

//      System.out.println("Category Id is: ".concat(category.map(c -> c.getId().toString()).orElse("")));
//      System.out.println("Unit Of Measure Id is: ".concat(unitOfMeasure.map(u -> u.getId().toString()).orElse("")));

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
