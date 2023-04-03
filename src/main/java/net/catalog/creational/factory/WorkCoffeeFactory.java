package net.catalog.creational.factory;

public class WorkCoffeeFactory implements  CoffeeBreakFactory{
    @Override
    public CoffeeBreak create() {
        return new WorkCoffee();
    }
}
