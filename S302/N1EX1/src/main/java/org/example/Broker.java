package org.example;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<StockBrokerage> stock = new ArrayList<StockBrokerage>();
    private double state;

    public double getState(){
        return state;
    }
    public void setState(double state){
        this.state = state;
        notifyAllStock();
    }

    public void add(StockBrokerage stockBrokerage){
        stock.add(stockBrokerage);
    }

    public void notifyAllStock(){
        stock.forEach(x-> x.refresh());
    }
}
