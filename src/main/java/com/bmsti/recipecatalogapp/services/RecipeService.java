package com.bmsti.recipecatalogapp.services;

import com.bmsti.recipecatalogapp.domain.Recipe;

import java.util.Set;

/**
 * @author angelo santos
 * @version 1.0
 * @since 17/08/2020
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
