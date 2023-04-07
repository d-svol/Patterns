package net.catalog.creational.prototype;

public class Human implements Cloneable {
    private int age;
    private String name;
    private String surname;
    private int height;

    public Human(int age, String name, String surname, int height) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.height = height;
    }

    @Override
    protected Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                '}';
    }
}
