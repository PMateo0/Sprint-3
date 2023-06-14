package org.example;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();

        new StockBrokerageNA(broker);
        new StockBrokerageJA(broker);
        new StockBrokeragePA(broker);

        System.out.println("El crecimiento de la bolsa ha aumentado un: 5.6%");
        broker.setState(0.056);
        System.out.println("------------------------------------------------");
        System.out.println("El crecimiento de la bolsa ha disminuido un -3.2%");
        broker.setState(-0.032);
    }
}

