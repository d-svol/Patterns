package net.catalog.structural.bridge;

public class GasolineEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting gasoline engine...");
    }
}
