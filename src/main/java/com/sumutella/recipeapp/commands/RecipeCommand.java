package com.sumutella.recipeapp.commands;

import com.sumutella.recipeapp.models.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 8:23 PM
 * @since 12/6/2019, Fri
 */
@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Integer id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Difficulty difficulty;
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();
}