package org.example;

public class ShoesShop {
    private String shoesName;
    private int price;

    public ShoesShop(String shoesName, int price){
        this.shoesName = shoesName;
        this.price = price;
    }
    void sell(Payment payment){
        System.out.println("La compra de " + shoesName + " por " + price+ " se está realizando.");
        payment.payed();
    }
}
