package net.catalog.structural.bridge2;

import net.catalog.structural.bridge.Car;
import net.catalog.structural.bridge.EconomyCar;
import net.catalog.structural.bridge.ElectricEngine;
import net.catalog.structural.bridge.Engine;
import net.catalog.structural.bridge.GasolineEngine;
import net.catalog.structural.bridge.LuxuryCar;

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
