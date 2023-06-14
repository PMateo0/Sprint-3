package org.example;
public class WireTransfer implements Payment{
    @Override
    public void payed() {System.out.println("El cobro ha tramitado por Transferencia bancaria.");}
}
