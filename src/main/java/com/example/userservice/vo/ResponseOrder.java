package com.example.userservice.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseOrder {
    String productId;
    Integer qty;
    Integer unitPrice;
    Integer totalPrice;
    Date createdAt;

    String orderId;
}
