package net.catalog.creational.abstractFactory;


public class WorkCoffee implements StrongCoffee {
    @Override
    public void byDrink() {
        System.out.println("By strong coffee for 2$");
    }

    @Override
    public void writeDrink() {
        System.out.println("At work I drink strong coffee for 2$");
    }
}

