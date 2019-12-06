package com.sumutella.recipeapp.commands;

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
public class NotesCommand {
    private Integer id;
    private String recipeNotes;

}