package net.catalog.behavioral.state;

public class ContextState {
    State state;
    String text;

    public ContextState(State state, String text) {
        this.state = state;
        this.text = text;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void write(){
        state.write(this);
    }
}
