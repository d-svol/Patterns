package net.catalog.structural.facade;

public class Power {
    public boolean on(){
        System.out.println("Power ON");
        return true;

    }
    public boolean off(){
        System.out.println("Power OFF");
        return false;
    }
}
