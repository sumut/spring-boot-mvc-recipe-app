package com.sumutella.recipeapp.commands;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author sumutella
 * @time 8:23 PM
 * @since 12/6/2019, Fri
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Integer id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand unitOfMeasure;

}