package net.catalog.behavioral.command;

public class AttackCommand implements Command{
    private Hill hill;

    public AttackCommand(Hill hill) {
        this.hill = hill;
    }

    @Override
    public void execute() {
        hill.attack();
    }
}
