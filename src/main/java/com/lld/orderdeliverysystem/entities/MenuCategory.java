package com.lld.orderdeliverysystem.entities;



import com.lld.orderdeliverysystem.enums.CourseType;
import com.lld.orderdeliverysystem.enums.ItemType;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements  IMenuComponent{

    private ItemType itemType;
    private CourseType courseType;

    private List<IMenuComponent> items = new ArrayList<>();

    public MenuCategory(ItemType itemType) {
        this.itemType = itemType;
    }

    public MenuCategory(CourseType courseType){
        this.courseType = courseType;
    }


    public MenuCategory(ItemType itemType, CourseType courseType) {
        this.itemType = itemType;
        this.courseType = courseType;
    }

    public MenuCategory(ItemType itemType, CourseType courseType, List<IMenuComponent> items) {
        this.itemType = itemType;
        this.courseType = courseType;
        this.items = items;
    }

    public MenuCategory(ItemType itemType, List<IMenuComponent> items) {
        this.itemType = itemType;
        this.items = items;
    }

    @Override
    public void display(int level) {
        String indent = " ".repeat(level);

        if (itemType != null) {
            System.out.println(indent+"\uD83D\uDCC2 "+itemType);
        }

        if (courseType != null) {
            System.out.println(indent.repeat(2)+"\uD83D\uDCC2 "+courseType);
        }

        for (IMenuComponent component : items) {
            component.display(level+1);
        }
    }

    public void add(IMenuComponent component) {
        items.add(component);
    }

    public void remove(IMenuComponent component) {
        items.remove(component);
    }

    public ItemType getItemType() {
        return itemType;
    }


    public List<IMenuComponent> getItems() {
        return items;
    }


    public CourseType getCourseType() {
        return courseType;
    }
}
