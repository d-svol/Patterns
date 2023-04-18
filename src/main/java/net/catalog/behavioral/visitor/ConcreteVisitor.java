package net.catalog.behavioral.visitor;

public class ConcreteVisitor implements Visitor{
    @Override
    public void saysDog() {
        System.out.println("Haaaw");
    }

    @Override
    public void saysCat() {
        System.out.println("Maaaay");
    }
}
