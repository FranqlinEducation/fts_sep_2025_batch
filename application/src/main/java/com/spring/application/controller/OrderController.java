package com.spring.application.controller;


import com.spring.application.OrderEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    public static String saveOrders (List<OrderEntity> orderList){


        /// we need save in the database
        return "Orders saved sucesfully";
    }
}
