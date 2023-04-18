package net.catalog.behavioral.strategy;

public class AveragePrice implements Strategy{
    @Override
    public double getPrice(double price) {
        return price * 0.25;
    }
}
