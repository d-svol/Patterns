package net.catalog.behavioral.command;

public class User {
    Command attack;
    Command defence;
    Command healing;

    public User(Command attack, Command defence, Command healing) {
        this.attack = attack;
        this.defence = defence;
        this.healing = healing;
    }



    void attackWizard() {
        attack.execute();
    }

    void defenceWizard() {
        defence.execute();
    }

    void healingWizard() {
        healing.execute();
    }
}
