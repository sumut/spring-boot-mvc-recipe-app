package com.sumutella.recipeapp.models;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author sumutella
 * @time 12:52 PM
 * @since 12/2/2019, Mon
 */
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private BigDecimal amount;
    @ManyToOne
    private Recipe recipe;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure unitOfMeasure;

    public Ingredient() {
    }

    public Ingredient(String s, BigDecimal bigDecimal, UnitOfMeasure eachUom, Recipe guacRecipe) {
        this.description = s;
        this.amount = bigDecimal;
        this.unitOfMeasure = eachUom;
        this.recipe = guacRecipe;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
