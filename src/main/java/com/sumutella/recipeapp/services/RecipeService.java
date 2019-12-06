package com.sumutella.recipeapp.services;

import com.sumutella.recipeapp.commands.RecipeCommand;
import com.sumutella.recipeapp.models.Recipe;

import java.util.Set;

/**
 * @author sumutella
 * @time 11:26 AM
 * @since 12/4/2019, Wed
 */
public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Integer id);

    RecipeCommand findCommandById(Integer id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Integer idToDelete);
}
