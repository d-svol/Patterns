package net.catalog.creational.factory;

public class TravelCoffeeFactory implements  CoffeeBreakFactory{
    @Override
    public CoffeeBreak create() {
        return new TravelCoffee();
    }
}
