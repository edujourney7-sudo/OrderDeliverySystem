package com.lld.orderdeliverysystem.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenuComponent {

    private String name;

    public Menu(String menu){
        this.name = name;
    }

    private List<IMenuComponent> items = new ArrayList<>();

    @Override
    public void display(int level) {
       for(IMenuComponent item : items){
              item.display(level+1);
       }
 }


    public void add(IMenuComponent component) {
        items.add(component);

    }

    public void remove(IMenuComponent component) {
      items.remove(component);
    }



}
