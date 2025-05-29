package com.designpatterns.creational.factory.VehicleFactory;

public class BUS implements Vehicle {

	@Override
	public void getCCofEngine() {
		// TODO Auto-generated method stub
		System.out.println("Bus CC 150");
	}

	@Override
	public void getModel() {
		// TODO Auto-generated method stub
		System.out.println("Bus model is Maruti");
	}

	@Override
	public void getFuelCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Bus Fuel Capacity is 100");
	}

}
