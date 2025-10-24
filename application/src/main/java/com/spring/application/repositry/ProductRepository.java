package com.spring.application.repositry;

import com.spring.application.ProductDto;
import com.spring.application.ProductEntity;
import com.spring.application.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {


    @Query(value = "select * from t_products",nativeQuery = true)
    List<ProductEntity> getAllProducts();


    // roll backs every thingg
    @Transactional
    @Modifying
    @Query(value = "delete from t_products where product_name = :productName",nativeQuery = true)
    void deleteProductByProductName(@Param("productName") String productName);


    @Query(value = "select new com.spring.application.ProductDto(user_name,product_name,product_description,product_image) from UserEntity u join ProductEntity p on u.user_id = p.user_id \n" +
            "where user_name = :userName")
    List<ProductDto> getProductDetailsByUserName(@Param("userName") String userName);
}
