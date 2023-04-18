package net.catalog.behavioral.command;

public class HealingCommand implements Command{
    private Hill hill;

    public HealingCommand(Hill hill) {
        this.hill = hill;
    }

    @Override
    public void execute() {
        hill.healing();
    }
}
