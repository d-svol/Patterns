package net.catalog.behavioral.state;

public class Code implements State {
    @Override
    public void write(ContextState contextState) {
        System.out.println("Write code ");
    }
}
