package org.example;

public class StockBrokerageJA extends StockBrokerage{
    private static double fondos = 456345.122;

    public StockBrokerageJA(Broker broker){
        this.broker = broker;
        this.broker.add(this);
    }
    @Override
    public void refresh() {
        System.out.println("Fondos:  " + fondos + " Cambio fondos " +(broker.getState()*fondos));
    }
}