package com.sumutella.recipeapp.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author sumutella
 * @time 1:35 PM
 * @since 12/3/2019, Tue
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Category() {
    }

}
