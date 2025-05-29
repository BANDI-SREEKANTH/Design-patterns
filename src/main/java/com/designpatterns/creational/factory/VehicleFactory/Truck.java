package com.designpatterns.creational.factory.VehicleFactory;

public class Truck implements Vehicle {

	@Override
	public void getCCofEngine() {
		// TODO Auto-generated method stub
		System.out.println("Truck CC 150");
	}

	@Override
	public void getModel() {
		// TODO Auto-generated method stub
		System.out.println("Truck model is Maruti");
	}

	@Override
	public void getFuelCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Truck Fuel Capacity is 100");
	}
}
