package com.designpatterns.behavioural.template.beverage;

public abstract class Beverage {
    public final void prepareRecipe()
    {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
    void boilWater()
    {
        System.out.println("Boiling the water");
    }
    void pourInCup()
    {
        System.out.println("Puring in to the cup");
    }
    abstract void brew();
    abstract void addCondiments();
}

