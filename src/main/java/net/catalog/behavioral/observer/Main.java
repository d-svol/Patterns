package net.catalog.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer1 = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();
        NewsChannel observer3 = new NewsChannel();
        NewsChannel observer4 = new NewsChannel();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        observable.addObserver(observer4);

        observable.setNews("Hello world");
        System.out.println(observable.printNews());
    }
}
