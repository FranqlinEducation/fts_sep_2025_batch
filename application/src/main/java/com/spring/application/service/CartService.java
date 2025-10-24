package com.spring.application.service;

import com.spring.application.CartEntity;
import com.spring.application.repositry.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {


    @Autowired
    CartRepository cartRepository;

    public CartEntity saveCartDetails(CartEntity cartEntity) {
        return cartRepository.save(cartEntity);
    }

    public List<CartEntity> getCartDetails() {
        return cartRepository.findAll();
    }

    public CartEntity updateCartDetails(CartEntity cartEntity) throws Exception {


        // we need to check whether same item available in cart of not
        CartEntity cartEntityNew= cartRepository.getByOrderName(cartEntity.getOrderName());

        if(cartEntityNew==null){
            throw new Exception("Order not available with given order name");
        }


        return cartRepository.save(cartEntity);
    }

    public void deleteCartDetails(Integer cartId) {
        cartRepository.deleteById(cartId);
    }
}
