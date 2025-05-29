package com.designpatterns.creational.factory.VehicleFactory;

public class Van implements Vehicle {

	@Override
	public void getCCofEngine() {
		// TODO Auto-generated method stub
		System.out.println("Van CC 150");
	}

	@Override
	public void getModel() {
		// TODO Auto-generated method stub
		System.out.println("Van model is Maruti");
	}

	@Override
	public void getFuelCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Van Fuel Capacity is 100");
	}
}
