package com.spring.application.controller;

import com.spring.application.ProductDto;
import com.spring.application.ProductEntity;
import com.spring.application.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // allow calls from frontend
public class ProductController {

    private final ProductService productService;

    // Create product
    @PostMapping("/save")
    public ProductEntity createProduct(@RequestBody ProductEntity productEntity) {
        return productService.createProduct(productEntity);
    }

    // Get all products
    @GetMapping
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    // Delete product by name
    @DeleteMapping
    public void deleteProduct(@RequestParam("productName") String productName) {
        productService.deleteProductByProductName(productName);
    }

    // Update product
    @PutMapping("/update")
    public ProductEntity updateProduct(@RequestBody ProductEntity productEntity) {
        return productService.updateProduct(productEntity);
    }

    // Get product details by user name
    @GetMapping("/user/{userName}")
    public List<ProductDto> getProductDetails(@PathVariable String userName) {
        return productService.getProductDetailsByUserName(userName);
    }
}
