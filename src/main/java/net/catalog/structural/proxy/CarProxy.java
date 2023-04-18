package net.catalog.structural.proxy;

public class CarProxy implements Car{
    Car car = new LuxCar();

    @Override
    public void drive() {
        System.out.println("Start class CarProxy");
        car.drive();
    }
}
