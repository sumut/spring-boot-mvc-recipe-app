package com.sumutella.recipeapp.controllers;


import com.sumutella.recipeapp.models.Category;
import com.sumutella.recipeapp.models.UnitOfMeasure;
import com.sumutella.recipeapp.repositories.CategoryRepository;
import com.sumutella.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author sumutella
 * @time 11:19 PM
 * @since 12/3/2019, Tue
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String showIndexPage(Model model){
        Optional<Category> optionalCategory = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("Category id is :" + optionalCategory.get().getId());
        System.out.println("Unit of Measure id is :" + optionalUnitOfMeasure.get().getId());


        return "index";
    }

}
