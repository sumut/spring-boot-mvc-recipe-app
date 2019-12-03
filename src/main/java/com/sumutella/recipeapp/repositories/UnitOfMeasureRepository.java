package com.sumutella.recipeapp.repositories;

import com.sumutella.recipeapp.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author sumutella
 * @time 10:43 PM
 * @since 12/3/2019, Tue
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
