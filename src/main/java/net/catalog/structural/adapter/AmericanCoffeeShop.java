package net.catalog.structural.adapter;

public class AmericanCoffeeShop implements AmericanCoffee{
    @Override
    public void getCoffee() {
        System.out.println("Make American coffee...");
    }
}
