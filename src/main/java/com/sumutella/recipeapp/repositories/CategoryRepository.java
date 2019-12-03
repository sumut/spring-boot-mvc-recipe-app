package com.sumutella.recipeapp.repositories;

import com.sumutella.recipeapp.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author sumutella
 * @time 10:42 PM
 * @since 12/3/2019, Tue
 */
public interface CategoryRepository extends CrudRepository<Category, Integer> {

    Optional<Category> findByDescription(String description);
}
