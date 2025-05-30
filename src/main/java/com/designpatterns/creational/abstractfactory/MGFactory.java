package com.designpatterns.creational.abstractfactory;

public class MGFactory implements VehicleFactory{
    @Override
    public Vehicle creteVehicle() {
        return new MG();
    }
}
