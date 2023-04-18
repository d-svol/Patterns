package net.catalog.structural.bridge;

public class LuxuryCar extends Car {

    public LuxuryCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving luxury car.");
    }
}
