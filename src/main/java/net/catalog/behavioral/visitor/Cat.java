package net.catalog.behavioral.visitor;

public class Cat implements Animal{
    @Override
    public void saysAnimal(Visitor visitor) {
        visitor.saysCat();
    }
}
