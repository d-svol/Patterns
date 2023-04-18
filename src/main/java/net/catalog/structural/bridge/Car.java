package net.catalog.structural.bridge;

public abstract class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
