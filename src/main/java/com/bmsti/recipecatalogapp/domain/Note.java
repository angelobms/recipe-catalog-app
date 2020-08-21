package com.bmsti.recipecatalogapp.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author angelo santos
 * @version 1.0
 * @since 17/08/2020
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNote;

}
