package com.designpatterns.behavioural.template.beverage;

public class TeaBeverage extends Beverage{
    public void brew()
    {
        System.out.println("Brewing the Tea beverage");
    }
    public void addCondiments()
    {
        System.out.println("Adding condiments in to the Tea beverage");
    }
}
