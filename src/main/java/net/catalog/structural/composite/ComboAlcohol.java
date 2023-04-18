package net.catalog.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ComboAlcohol implements Alcohol{
    private List<Alcohol> components = new ArrayList<>();
    private String comboName;

    public ComboAlcohol(String comboName) {
        this.comboName = comboName;
    }

    public void addComponent(Alcohol component){
        components.add(component);
    }

    public  void remove(Alcohol component){
        components.remove(component);
    }


    @Override
    public void prepare() {
        System.out.println("Preparing alcohol combo " + comboName);
        for (Alcohol component : components){
            component.prepare();
        }
    }
}
