package net.catalog.behavioral.command;

public class Main {
    public static void main(String[] args) {
    // I need to read Structural Facade
        Hill hill = new Hill();
        User user = new User(new AttackCommand(hill), new DefenceCommand(hill), new HealingCommand(hill));
        user.attackWizard();
        user.healingWizard();
        user.defenceWizard();
        user.healingWizard();
    }
}
