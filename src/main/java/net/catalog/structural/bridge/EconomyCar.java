package net.catalog.structural.bridge;

public class EconomyCar extends Car{
    public EconomyCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving luxury car.");
    }
}
