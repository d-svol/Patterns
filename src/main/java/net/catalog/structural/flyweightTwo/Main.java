package net.catalog.structural.flyweightTwo;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        
        Figure circle1 = factory.getFigure("Circle");
        Figure circle2 = factory.getFigure("Circle");
        Figure square = factory.getFigure("Square");
        Figure figure = factory.getFigure("NASA");


        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(square);
        System.out.println(figure);
    }
}
