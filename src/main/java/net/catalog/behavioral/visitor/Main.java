package net.catalog.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.saysAnimal(new ConcreteVisitor());
    }
}
