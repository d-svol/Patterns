package net.catalog.creational.builder;

public class ComputerBuilder {
    private String brand;
    private String processor;
    private int memory;
    private boolean hasSSD;
    private int storage;

    public ComputerBuilder setBrand(String brand){
        this.brand = brand;
        return this;
    }

    public ComputerBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setMemory(int memory){
        this.memory = memory;
        return this;
    }

    public ComputerBuilder setHasSSD(boolean hasSSD){
        this.hasSSD = hasSSD;
        return this;
    }

    public ComputerBuilder setStorage(int storage){
        this.storage = storage;
        return this;
    }

    public Computer build() {
        return new Computer(brand, processor, memory, hasSSD, storage);
    }
}
