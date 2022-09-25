package com.example.Shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Shop {

    private String id;
    private String city;
    private String street;
    private String nameShop;
    private String workers;
    private boolean website;

    }