package net.catalog.structural.flyweightOne;

public class Main {
    public static void main(String[] args) {
        FlyweightMercedes flyweightMercedes = new FlyweightMercedes();
        Mercedes mercedesA = flyweightMercedes.getMercedes("green");
        Mercedes mercedesB = flyweightMercedes.getMercedes("red");
        Mercedes mercedesC = flyweightMercedes.getMercedes("green");
        System.out.println(mercedesC.color);
    }
}
