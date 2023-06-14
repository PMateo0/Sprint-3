package org.example;

public class Converter implements Money {

    @Override
    public double calculate(double price, String currency) {
        double value = 0;
        switch (currency.toLowerCase()) {
            case "dolar":
               value = price * 1.08;
                break;
            case "yen":
                value = price * 150.22;
                break;
            case "peso":
               value = price * 264.08;
                break;
            default:
                value = price;
        }
    return value;
    }
}
