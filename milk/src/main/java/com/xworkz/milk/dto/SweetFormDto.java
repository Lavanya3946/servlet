package com.xworkz.milk.dto;





public class SweetFormDto {
    private  int id;
    private String shopName;
    private String sweetName;
    private boolean isSpecial;
    private int quantity;
    private double totalPrice;

    public SweetFormDto(int id, String shopName, String sweetName, boolean isSpecial, int quantity, double totalPrice) {
        this.id = id;
        this.shopName = shopName;
        this.sweetName = sweetName;
        this.isSpecial = isSpecial;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public SweetFormDto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getSweetName() {
        return sweetName;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "SweetFormDto{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", sweetName='" + sweetName + '\'' +
                ", isSpecial=" + isSpecial +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
