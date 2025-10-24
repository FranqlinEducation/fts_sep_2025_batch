package com.spring.application;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name="t_cart")
@Entity
@Getter
@Setter
public class CartEntity {

    @Id
    private Integer cart_id;
    private String orderName;
    private String description;
    private Integer quantity;
    private Double itemCost;
}
