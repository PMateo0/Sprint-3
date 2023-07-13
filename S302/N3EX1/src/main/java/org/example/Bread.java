package org.example;

public class Bread {
    private double price;
    private final Converter converter;

    public Bread (Converter converter, double price){
        this.price = price;
        this.converter = converter;
    }
    public double convert(String currency){return converter.calculate(price,currency);}
}

