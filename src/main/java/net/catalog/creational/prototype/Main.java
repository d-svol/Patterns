package net.catalog.creational.prototype;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        int age = 22;
        String name = "Nix";
        String surname = "Fox";
        int height = 175;
        HumanPrototype humanPrototype = new HumanPrototype();
        humanPrototype.setHuman(new Human(age, name, surname, height));

        Human human = humanPrototype.getHuman();
        System.out.println(human.toString());
    }
}
