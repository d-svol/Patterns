package net.catalog.structural.adapter;

public class AmericanToEuropeanAdapter implements AmericanCoffee {
    EuropeCoffee europeCoffee;

    public AmericanToEuropeanAdapter(EuropeCoffee europeCoffee) {
        this.europeCoffee = europeCoffee;
    }

    @Override
    public void getCoffee() {
        europeCoffee.getCoffee();
    }
}
