package org.example;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk(new Converter(), 2.34);
        System.out.println("The price of the Milk in Dolar is " +  milk.convert("dolar"));


        Bread bread = new Bread(new Converter(), 0.89);
        System.out.println("The price of the bread in Yen is " + bread.convert("yen"));

    }
}
