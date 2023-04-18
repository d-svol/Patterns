package net.catalog.behavioral.visitor;

public class Dog implements Animal{
    @Override
    public void saysAnimal(Visitor visitor) {
        visitor.saysDog();
    }
}
