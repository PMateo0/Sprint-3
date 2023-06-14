package org.example;

public class Main {
    public static void main(String[] args) {
        ShoesShop shoesShop = new ShoesShop("Nike Dunk Low Siracusse",530);

        Paypal paypal = new Paypal();
        CreditCard creditCard = new CreditCard();
        WireTransfer wireTransfer = new WireTransfer();

        shoesShop.sell(paypal);
        shoesShop.sell(creditCard);
        shoesShop.sell(wireTransfer);
    }
}
