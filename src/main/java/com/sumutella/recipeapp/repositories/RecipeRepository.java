package com.sumutella.recipeapp.repositories;

import com.sumutella.recipeapp.models.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sumutella
 * @time 10:40 PM
 * @since 12/3/2019, Tue
 */
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
