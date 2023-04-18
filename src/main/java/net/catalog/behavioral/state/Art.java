package net.catalog.behavioral.state;

public class Art implements State {
    @Override
    public void write(ContextState contextState) {
        System.out.println("Write graffiti " + contextState.text.toUpperCase());
    }
}
