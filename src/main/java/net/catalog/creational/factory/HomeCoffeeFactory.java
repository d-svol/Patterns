package net.catalog.creational.factory;

public class HomeCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee create() {
        return new HomeCoffee();
    }
}
