package com.designpatterns.creational.abstractfactory;

public class MG implements Vehicle{
    @Override
    public void getFuelCapacity() {
        System.out.println("MG capcatiy is 300");
    }

    @Override
    public void getModel() {
        System.out.println("MG Model Electric");
    }
}
