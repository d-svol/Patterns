package net.catalog.structural.adapter;

public class Main {
    public static void main(String[] args) {
        EuropeCoffee europeCoffee = new EuropeCoffeeShop();

        UkraineCoffeeShop ukraineCoffeeShop = new UkraineCoffeeShop();
        // A Ukrainian coffee shop can make American coffee, but not European coffee
        System.out.println("Standard method");
        ukraineCoffeeShop.makeCoffee(new AmericanCoffeeShop());
        System.out.println("==================================" + "\n");

        // Let's pass the coffee through the adapter from American to European
        AmericanCoffee americanCoffee = new AmericanToEuropeanAdapter(europeCoffee);
        System.out.println("Adapted method");
        ukraineCoffeeShop.makeCoffee(americanCoffee);

    }
}
