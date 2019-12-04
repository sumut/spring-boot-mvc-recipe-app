package com.sumutella.recipeapp.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author sumutella
 * @time 10:48 AM
 * @since 12/2/2019, Mon
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;

}
