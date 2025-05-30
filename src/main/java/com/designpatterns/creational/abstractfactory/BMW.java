package com.designpatterns.creational.abstractfactory;

public class BMW implements Vehicle{
    public void getModel()
    {
        System.out.println("BMW Model");
    }
    public void getFuelCapacity()
    {
        System.out.println("BMW Capacity is 100");
    }
}
