package net.catalog.behavioral.strategy;

public class MaxPrice implements Strategy{
    @Override
    public double getPrice(double price) {
        return price * 0.58;
    }
}
