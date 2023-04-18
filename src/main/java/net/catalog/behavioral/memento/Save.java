package net.catalog.behavioral.memento;

public class Save {
    private String level;
    private int milliseconds;

    public Save(String level, int milliseconds) {
        this.level = level;
        this.milliseconds = milliseconds;
    }

    public String getLevel() {
        return level;
    }

    public int getMilliseconds() {
        return milliseconds;
    }
}
