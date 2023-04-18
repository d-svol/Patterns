package net.catalog.structural.flyweightTwo;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Figure> map = new HashMap<>();

    public Figure getFigure(String figureName) {
        Figure figure = map.get(figureName);
        if (figure == null) {
            switch (figureName) {
                case "Circle": {
                    figure = new Circle();
                    break;
                }
                case "Square": {
                    figure = new Square();
                    break;
                }
                case "Triangle": {
                    figure = new Triangle();
                    break;
                }
                default:
                    figure = new Figure();
            }
            map.put(figureName, figure);
        }
        return figure;
    }
}
