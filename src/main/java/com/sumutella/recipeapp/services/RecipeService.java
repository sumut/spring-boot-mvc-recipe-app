package com.sumutella.recipeapp.services;

import com.sumutella.recipeapp.models.Recipe;

import java.util.Set;

/**
 * @author sumutella
 * @time 11:26 AM
 * @since 12/4/2019, Wed
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
