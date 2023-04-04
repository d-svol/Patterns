package net.catalog.creational.abstractFactory;


public class HomeCoffeeFactory implements StrongCoffeeFactory {
    @Override
    public StrongCoffee create() {
        return new HomeCoffee();
    }
}
