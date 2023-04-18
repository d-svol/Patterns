package net.catalog.structural.bridge2;

public class EconomyCar implements Car{
    Engine engine;
    public EconomyCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving luxury car.");
    }

}
