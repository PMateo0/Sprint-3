package org.example;

public class Milk {
    protected double price;
    private final Converter converter;

    public Milk (Converter converter, double price){
        this.price = price;
        this.converter = converter;
    }
    public double convert(String currency){
        return converter.calculate(price,currency);
    }
}
