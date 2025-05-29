package com.designpatterns.creational.factory.VehicleFactory;

public class CAR implements Vehicle {

	@Override
	public void getCCofEngine() {
		// TODO Auto-generated method stub
		System.out.println("Car CC 150");
	}

	@Override
	public void getModel() {
		// TODO Auto-generated method stub
		System.out.println("Car model is Maruti");
	}

	@Override
	public void getFuelCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Car Fuel Capacity is 100");
	}
}
