package net.catalog.behavioral.state;

public class Book implements State {
    @Override
    public void write(ContextState contextState) {
        System.out.println("Write book " + contextState.text.toLowerCase());
    }
}
