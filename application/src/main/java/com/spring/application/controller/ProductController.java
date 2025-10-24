package com.spring.application.controller;

import com.spring.application.ProductDto;
import com.spring.application.ProductEntity;
import com.spring.application.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;


    // create products
    @PostMapping(value = "products/save")
    public ProductEntity createProduct(@RequestBody ProductEntity productEntity){
        return productService.createProduct(productEntity);
    }
    // get products
    @GetMapping
    public List<ProductEntity> getAllProducts(){
        return productService.getAllProducts();
    }
    // delete products

    @DeleteMapping
    public void deleteProduct(@RequestParam("productName") String productName){
        productService.deleteProductByProductName(productName);
    }
    // update products

    @PutMapping(value = "/update")
    public ProductEntity updateProduct(@RequestBody ProductEntity productEntity){
        return productService.updateProduct(productEntity);
    }
    // get products by user name

    public List<ProductDto> getProductDetails(String userName){
        return  productService.getProductDetailsByUserName(userName);
    }






}
