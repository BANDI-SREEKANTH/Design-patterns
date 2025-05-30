package com.designpatterns.creational.abstractfactory;

public class BMWFactory implements VehicleFactory{
    @Override
    public Vehicle creteVehicle() {
        return new BMW();
    }
}
