package net.catalog.structural.bridge2;


public class LuxuryCar implements Car {
    Engine engine;
    public LuxuryCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving luxury car.");
    }
}
