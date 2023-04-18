package net.catalog.structural.bridge2;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting electric engine...");
    }
}