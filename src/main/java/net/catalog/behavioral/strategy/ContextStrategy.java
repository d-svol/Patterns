package net.catalog.behavioral.strategy;

public class ContextStrategy {
    Strategy strategy;

    public ContextStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public  double getPrice(double price){
        return strategy.getPrice(price);
    }
}
