package com.designpatterns.creational.abstractfactory;

public class TechMahindra implements  Vehicle{
    @Override
    public void getFuelCapacity() {
        System.out.println("TM capcatiy is 200");
    }

    @Override
    public void getModel() {
        System.out.println("Model is 2-TM");
    }
}
