package com.lld;

import com.lld.orderdeliverysystem.entities.Item;
import com.lld.orderdeliverysystem.entities.Menu;
import com.lld.orderdeliverysystem.entities.MenuCategory;
import com.lld.orderdeliverysystem.enums.CourseType;
import com.lld.orderdeliverysystem.enums.ItemType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        MenuCategory vegStarters = new MenuCategory(ItemType.VEG,CourseType.STARTER);

        Item item1 = new Item("PannerChilli",200);
        Item item2 = new Item("PaneerNoodels",150);

        vegStarters.add(item1);
        vegStarters.add(item2);

        MenuCategory vegMainCourse = new MenuCategory(ItemType.VEG,CourseType.MAINCOURSE);

        Item mc1 = new Item("DaalChawal",200);
        Item mc2 = new Item("ShahiPanner",150);

        vegMainCourse.add(mc1);
        vegMainCourse.add(mc2);

        MenuCategory nonVegStarters = new MenuCategory(ItemType.NONVEG,CourseType.STARTER);

        Item nvi1 = new Item("MuttonKeem",200);
        Item nvi2 = new Item("ChickenLollipop",150);

        nonVegStarters.add(nvi1);
        nonVegStarters.add(nvi2);


        MenuCategory nonVegMainCourse = new MenuCategory(ItemType.NONVEG,CourseType.MAINCOURSE);


        Item nvmc1 = new Item("Biryani",200);
        Item nvmc2 = new Item("Butter Chicken Gray",150);

        nonVegStarters.add(nvmc1);
        nonVegStarters.add(nvmc2);


       Menu menu = new Menu("Taj Hotel Menu");

       menu.add(vegStarters);
       menu.add(vegMainCourse);
       menu.add(nonVegStarters);
       menu.add(nonVegMainCourse);

       menu.display(1);


    }
}
