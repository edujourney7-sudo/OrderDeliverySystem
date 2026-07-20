package com.lld.orderdeliverysystem.entities;

import com.lld.orderdeliverysystem.enums.CourseType;
import com.lld.orderdeliverysystem.enums.ItemType;

public class Item implements IMenuComponent {



    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private ItemType type;
    private CourseType courseType;
    private String name;
    private double  price;

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CourseType getCategory() {
        return courseType;
    }

    public void setCategory(CourseType courseType) {
        this.courseType = courseType;
    }

    @Override
    public void display(int level) {
        String indent = "    ".repeat(level);

        System.out.printf("%s🍽 %s (₹%.2f)%n", indent, name, price);
    }

    }
