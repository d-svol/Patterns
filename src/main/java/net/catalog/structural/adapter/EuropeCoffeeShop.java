package net.catalog.structural.adapter;

public class EuropeCoffeeShop implements EuropeCoffee {
    @Override
    public void getCoffee() {
        System.out.println("Make Euro coffee");
    }
}
