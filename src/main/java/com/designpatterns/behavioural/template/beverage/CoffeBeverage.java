package com.designpatterns.behavioural.template.beverage;

public class CoffeBeverage extends Beverage{
    public void brew()
    {
        System.out.println("Brewing the Coffee beverage");
    }
    public void addCondiments()
    {
        System.out.println("Adding Condiments into the Coffee beverage");
    }
}
