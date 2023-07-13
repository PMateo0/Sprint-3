package org.example;

public class StockBrokeragePA extends StockBrokerage {
    private static double fondos = 3252512.123;

    public StockBrokeragePA(Broker broker) {
        this.broker = broker;
        this.broker.add(this);
    }

    @Override
    public void refresh() {
        System.out.println("Fondos:  " + fondos + " Cambio fondos: " +(broker.getState()*fondos));
    }
}
