package net.catalog.creational.builder;

public class Computer {
    private String brand;
    private String processor;
    private int memory;
    private boolean hasSSD;
    private final int storage;

    public Computer(String brand, String processor, int memory, boolean hasSSD, int storage) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.hasSSD = hasSSD;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean isHasSSD() {
        return hasSSD;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", memory=" + memory +
                ", hasSSD=" + hasSSD +
                '}';
    }
}
