package com.spring.application.repositry;

import com.spring.application.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity,Integer> {


    CartEntity getByOrderName(String orderName);
}
