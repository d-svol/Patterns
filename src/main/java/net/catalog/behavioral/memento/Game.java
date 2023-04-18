package net.catalog.behavioral.memento;

public class Game {
    private String level;
    private int milliseconds;

    public void setLevelAndMs(String level, int milliseconds) {
        this.level = level;
        this.milliseconds = milliseconds;
    }
    public void load(Save save){
        level = save.getLevel();
        milliseconds = save.getMilliseconds();
    }
    public Save save(){
        return new Save(level, milliseconds);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", milliseconds=" + milliseconds +
                '}';
    }
}
