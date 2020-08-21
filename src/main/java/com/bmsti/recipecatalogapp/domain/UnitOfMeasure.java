package com.bmsti.recipecatalogapp.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author angelo santos
 * @version 1.0
 * @since 17/08/2020
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
