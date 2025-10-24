package com.spring.application;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;


@Entity
@Table(name="t_order")
public class OrderEntity {

    @Id
    private String orderId;
    private String asset;
    private String Description;
    private String status;
    private String assignedTo;
    private Date dueDate;
}
