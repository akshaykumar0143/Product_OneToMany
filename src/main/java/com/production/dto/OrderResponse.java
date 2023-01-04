package com.production.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderResponse implements Serializable {
    private String name;
    private String PName;
    private double price;
}
