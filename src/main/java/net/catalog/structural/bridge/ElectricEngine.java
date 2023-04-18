package net.catalog.structural.bridge;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting electric engine...");
    }
}
