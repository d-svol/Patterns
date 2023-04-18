package net.catalog.creational.factory;

public class Main {
    public static void main(String[] args) {
        String placeType = "Home";
        CoffeeFactory coffeeFactory = createPlaceType(placeType);
        Coffee coffee = coffeeFactory.create();
        coffee.writeDrink();
    }

    static CoffeeFactory createPlaceType(String type) {
        return switch (type) {
            case "Home" -> new HomeCoffeeFactory();
            case "Work" -> new WorkCoffeeFactory();
            case "Travel" -> new TravelCoffeeFactory();
            default -> throw new RuntimeException(type + " is unknown specialty.");
        };
    }
}