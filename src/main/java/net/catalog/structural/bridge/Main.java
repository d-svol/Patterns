package net.catalog.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Engine gasolineEngine = new GasolineEngine();
        Engine electricEngine = new ElectricEngine();

        Car luxGasolineCar = new LuxuryCar(gasolineEngine);
        Car luxElectricCar = new EconomyCar(electricEngine);

        Car ecomomyGasolineCar = new EconomyCar(gasolineEngine);
        Car ecomomyElectricCar = new EconomyCar(electricEngine);

        luxElectricCar.drive();
        luxGasolineCar.drive();
        ecomomyGasolineCar.drive();
        ecomomyElectricCar.drive();

    }
}
