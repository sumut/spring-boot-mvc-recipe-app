package com.sumutella.recipeapp.controllers;

import com.sumutella.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sumutella
 * @time 7:26 AM
 * @since 12/6/2019, Fri
 */
@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

//    @RequestMapping("/recipe/show/{id}")
//    public String showById(@PathVariable String id, Model model){
//        model.addAttribute("recipe", recipeService.findById(Integer.valueOf(id)));
//        return "recipe/show";
//    }
}