package com.spring.application.service;

import com.spring.application.ProductDto;
import com.spring.application.ProductEntity;
import com.spring.application.repositry.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductEntity createProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public List<ProductEntity> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public void deleteProductByProductName(String productName) {
        productRepository.deleteProductByProductName(productName);
    }

    public ProductEntity updateProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public List<ProductDto> getProductDetailsByUserName(String userName) {
        return productRepository.getProductDetailsByUserName(userName);
    }
}
