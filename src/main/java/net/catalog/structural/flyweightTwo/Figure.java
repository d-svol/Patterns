package net.catalog.structural.flyweightTwo;

public class Figure {
    protected int width;
    protected int height;
    protected int radius;


    @Override
    public String toString() {
        return "Figure{" +
                "width=" + width +
                ", height=" + height +
                ", radius=" + radius +
                '}';
    }
}
