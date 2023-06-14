package org.example;

public class CreditCard implements Payment{

    @Override
    public void payed() {
        System.out.println("El cobro ha tramitado por Tarjeta de crédito.");

    }
}