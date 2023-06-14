package org.example;

public class Paypal implements Payment {
    @Override
    public void payed() {System.out.println("El cobro ha tramitado por Paypal.");}
}
