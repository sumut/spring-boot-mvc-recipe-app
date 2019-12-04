package com.sumutella.recipeapp.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author sumutella
 * @time 1:01 PM
 * @since 12/2/2019, Mon
 */
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    public UnitOfMeasure() {
    }

}
