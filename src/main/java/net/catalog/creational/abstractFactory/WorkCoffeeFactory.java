package net.catalog.creational.abstractFactory;


public class WorkCoffeeFactory implements StrongCoffeeFactory {
    @Override
    public StrongCoffee create() {
        return new WorkCoffee();
    }
}
