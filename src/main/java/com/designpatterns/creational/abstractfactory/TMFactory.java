package com.designpatterns.creational.abstractfactory;

public class TMFactory implements VehicleFactory{
    @Override
    public Vehicle creteVehicle() {
        return new TechMahindra();
    }
}
