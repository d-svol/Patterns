package net.catalog.creational.factory;

public class WorkCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee create() {
        return new WorkCoffee();
    }
}
