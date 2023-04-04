package net.catalog.creational.abstractFactory;


public class Main {
    public static void main(String[] args) {
        String placeType = "Home";
        StrongCoffeeFactory strongCoffeeFactory = createPlaceType(placeType);
        StrongCoffee strongCoffee = strongCoffeeFactory.create();
        strongCoffee.writeDrink();
        strongCoffee.byDrink();

    }

    static StrongCoffeeFactory createPlaceType(String type) {
        return switch (type) {
            case "Home" -> new HomeCoffeeFactory();
            case "Work" -> new WorkCoffeeFactory();
            default -> throw new RuntimeException(type + " is unknown specialty.");
        };
    }
}