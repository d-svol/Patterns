package net.catalog.creational.builder;

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new ComputerBuilder()
                .setHasSSD(true)
                .setBrand("Apple")
                .setProcessor("M2")
                .setStorage(1000)
                .setMemory(16)
                .build();

        System.out.println(myComputer.toString());
    }
}
