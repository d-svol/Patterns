package net.catalog.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Car car = new CarProxy();
        car.drive();
    }
}
