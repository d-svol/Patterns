package net.catalog.behavioral.command;

public class DefenceCommand implements Command{
    private Hill hill;

    public DefenceCommand(Hill hill) {
        this.hill = hill;
    }

    @Override
    public void execute() {
        hill.defence();
    }
}
