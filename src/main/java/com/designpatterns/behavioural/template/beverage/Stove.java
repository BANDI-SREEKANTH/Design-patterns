package com.designpatterns.behavioural.template.beverage;

public class Stove {
    public static void main(String[] args)
    {
        System.out.println("\t\t\t\t\t\tBeverage-1");
        Beverage coffeBeverage=new CoffeBeverage();
        coffeBeverage.prepareRecipe();
        System.out.println("\t\t\t\t\t\tBeverage-2");
        Beverage teaBeverage=new TeaBeverage();
        teaBeverage.prepareRecipe();
    }
}
