package net.catalog.creational.abstractFactory;

public class HomeCoffee implements StrongCoffee {
    @Override
    public void byDrink() {
        System.out.println("By strong coffee for 1$");
    }

    public void writeDrink() {

        System.out.println("At home by strong coffee for 1$");
    }
}
