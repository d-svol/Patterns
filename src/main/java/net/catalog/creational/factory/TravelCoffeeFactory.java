package net.catalog.creational.factory;

public class TravelCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee create() {
        return new TravelCoffee();
    }
}
