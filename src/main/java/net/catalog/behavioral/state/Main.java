package net.catalog.behavioral.state;

public class Main {
    public static void main(String[] args) {
        ContextState contextState = new ContextState(new Art(), "Hello world");
        contextState.write();
        System.out.println("=============");
        contextState.setState(new Book());
        contextState.write();
    }
}
