package net.catalog.structural.composite;

public class SimpleAlcohol implements Alcohol {
    private String name;

    public SimpleAlcohol(String name) {
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
    }
}
