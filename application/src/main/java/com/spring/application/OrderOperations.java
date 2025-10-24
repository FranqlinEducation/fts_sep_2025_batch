package com.spring.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderOperations {

    public static void main(String[] args) {
        Order obj1 = new Order();
        obj1.setOrderId("ord2");
        obj1.setAsset("asset2");
        obj1.setDescription("order 2 description");
        obj1.setStatus("completed");
        obj1.setAssignedTo("sham");
        obj1.setDueDate(new Date());

        List<Order> orderList = new ArrayList<>();
        //orderList.add(obj);
        orderList.add(obj1);
        saveOrders(orderList);
    }

    // save order
    public static String saveOrders (List<Order> orderList){


        /// we need save in the database
        return "Orders saved sucesfully";
    }

    // update order
    public static String updateOrders (List<Order> orderList){


        /// we need update  in the database
        return "Orders updated sucesfully";
    }

    // delete order
    public static String delete (Order order){


        /// we need save in the database
        return "Order deleted sucesfully";
    }


    //  get list of order
    public static List<Order> delete (){


        /// we need save in the database
        return new ArrayList<>();
    }

}
