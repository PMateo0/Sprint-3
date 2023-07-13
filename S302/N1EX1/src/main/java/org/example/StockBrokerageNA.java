package org.example;

public class StockBrokerageNA extends StockBrokerage{
    private static double fondos = 213441.12;

    public StockBrokerageNA(Broker broker){
        this.broker = broker;
        this.broker.add(this);
    }
    @Override
    public void refresh() {
        System.out.println("Fondos:  " + fondos + " Cambio fondos: " +(broker.getState()*fondos));
    }
}