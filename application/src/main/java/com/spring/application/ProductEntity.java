package com.spring.application;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_products")
@Getter
@Setter
public class ProductEntity {

    @Id
    private Integer product_id;
    private String product_name;
    private String product_description;
    private Double product_cost;
    @Lob
    @Column(name = "product_image")
    private byte[] product_image;



    // primary key in t_users table
    private Integer user_id;

}
