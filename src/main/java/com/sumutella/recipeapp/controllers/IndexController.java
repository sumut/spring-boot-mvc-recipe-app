package com.sumutella.recipeapp.controllers;


import com.sumutella.recipeapp.models.Category;
import com.sumutella.recipeapp.models.UnitOfMeasure;
import com.sumutella.recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author sumutella
 * @time 11:19 PM
 * @since 12/3/2019, Tue
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"/", "", "/index", "/index.html"})
    public String showIndexPage(Model model){
        log.debug("getting index page");
        model.addAttribute("recipes", recipeService.getRecipes());


        return "index";
    }

}
