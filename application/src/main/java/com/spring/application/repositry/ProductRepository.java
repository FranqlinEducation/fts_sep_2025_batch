package com.spring.application.repositry;

import com.spring.application.ProductDto;
import com.spring.application.ProductEntity;
import com.spring.application.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {


    @Query(value = "select * from t_products",nativeQuery = true)
    List<ProductEntity> getAllProducts();


    // roll backs every thingg
    @Transactional
    @Modifying
    @Query(value = "delete from t_products where product_name = :productName",nativeQuery = true)
    void deleteProductByProductName(@Param("productName") String productName);


    @Query(value = "select new com.spring.application.ProductDto(u.user_name,p.product_name,p.product_description,p.product_image) from UserEntity u join ProductEntity p on u.user_id = p.user_id \n" +
            "where user_name = :userName")
    List<ProductDto> getProductDetailsByUserName(@Param("userName") String userName);
}
