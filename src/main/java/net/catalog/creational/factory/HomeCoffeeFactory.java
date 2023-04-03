package net.catalog.creational.factory;

public class HomeCoffeeFactory implements  CoffeeBreakFactory{
    @Override
    public CoffeeBreak create() {
        return new HomeCoffee();
    }
}
