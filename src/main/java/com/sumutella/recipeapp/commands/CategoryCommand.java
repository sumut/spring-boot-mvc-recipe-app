package com.sumutella.recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author sumutella
 * @time 8:22 PM
 * @since 12/6/2019, Fri
 */
@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private Integer id;
    private String description;
}