package net.catalog.structural.composite;

public class Main {
    public static void main(String[] args) {
        // Create some simple coffees
        Alcohol tequila = new SimpleAlcohol("Tequila");
        Alcohol gin = new SimpleAlcohol("Gin");
        Alcohol vodka = new SimpleAlcohol("Vodka");

        // Create a coffee combo
        ComboAlcohol coffeeCombo = new ComboAlcohol("'Killer of newbies'");

        // Add the simple coffees to the combo
        coffeeCombo.addComponent(tequila);
        coffeeCombo.addComponent(gin);
        coffeeCombo.addComponent(vodka);

        // Prepare the coffee (including the coffee combo)
        coffeeCombo.prepare();
    }
}
