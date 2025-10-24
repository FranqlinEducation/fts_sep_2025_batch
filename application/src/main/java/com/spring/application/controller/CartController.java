package com.spring.application.controller;

import com.spring.application.CartEntity;
import com.spring.application.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    CartService cartService;

    // to save cart items
    @PostMapping(value = "save/cart-details")
    public CartEntity saveCartDetails(@RequestBody CartEntity cartEntity){
        return cartService.saveCartDetails(cartEntity);
    }

    @GetMapping(value = "cart-details")
    public List<CartEntity> getCartDetails(){
        return cartService.getCartDetails();
    }

    // update the cart details if available
    @PutMapping(value = "update/cart-details")
    public CartEntity updateCartDetails(@RequestBody CartEntity cartEntity) throws Exception {
        return cartService.updateCartDetails(cartEntity);
    }

    // delete the cart details
    @DeleteMapping(value = "delete/{cartId}")
    public void deleteCartDetails(@PathVariable("cartId") Integer cartId) throws Exception {
         cartService.deleteCartDetails(cartId);
    }
}
