package net.catalog.creational.factory;

public class Main {
    public static void main(String[] args) {
        CoffeeBreakFactory coffeeBreakFactory = creatPlaceType("Home");
        CoffeeBreak coffeeBreak = coffeeBreakFactory.create();
        coffeeBreak.writeDrink();
    }

    static CoffeeBreakFactory creatPlaceType(String type) {
        return switch (type) {
            case "Home" -> new HomeCoffeeFactory();
            case "Work" -> new WorkCoffeeFactory();
            case "Travel" -> new TravelCoffeeFactory();
            default -> throw new RuntimeException(type + " is unknown specialty.");
        };
    }
}