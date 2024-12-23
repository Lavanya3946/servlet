package com.xworkz.milk.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SweetFormDto {
    private String shopName;
    private String sweetName;
    private boolean isSpecial;
    private int quantity;
    private double totalPrice;


}
