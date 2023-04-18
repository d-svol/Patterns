package net.catalog.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        double dataPrice = 100;
        double myNewPrice = 0;

        ContextStrategy contextStrategy = new ContextStrategy(new MaxPrice());
        myNewPrice = contextStrategy.getPrice(dataPrice);
        System.out.println(myNewPrice);

        System.out.println("==============================");
        contextStrategy.setStrategy(new AveragePrice());
        myNewPrice = contextStrategy.getPrice(dataPrice);
        System.out.println(myNewPrice);
    }
}
