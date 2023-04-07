package net.catalog.creational.prototype;

public class HumanPrototype  {
    private Human human;

    public Human getHuman() throws CloneNotSupportedException {
        return human.clone();
    }

    public void setHuman(Human human) {
        this.human = human;
    }

}
