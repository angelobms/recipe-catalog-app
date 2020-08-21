package com.bmsti.recipecatalogapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author angelo santos
 * @version 1.0
 * @since 17/08/2020
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
