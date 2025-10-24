package com.spring.application;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_products")
@Getter
@Setter
public class ProductEntity {

    private Integer product_id;
    private String product_name;
    private String product_description;
    private Double product_cost;
    private byte product_image;


    // primary key in t_users table
    private Integer user_id;

}
