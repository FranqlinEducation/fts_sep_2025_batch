package com.spring.application;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class Order {

        private String orderId;
        private String asset;
        private String Description;
        private String status;
        private String assignedTo;
        private Date dueDate;

}
