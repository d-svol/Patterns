package net.catalog.creational.factory;

public class HomeCoffee implements Coffee {
    @Override
    public void writeDrink() {
        System.out.println("At home I drink Nescafe Latte");
    }
}
