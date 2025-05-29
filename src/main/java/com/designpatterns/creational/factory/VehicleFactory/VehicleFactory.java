package com.designpatterns.creational.factory.VehicleFactory;

public class VehicleFactory {
	public Vehicle getVehicle(String vehicleType)
	{
		if(vehicleType.equals("Car"))
		{
			return new CAR();
		}
		else if(vehicleType.equals("Bus"))
		{
			return new BUS();
		}
		else if(vehicleType.equals("Truck"))
		{
			return new Truck();
		}
		else if(vehicleType.equals("Van")) {
			return new Van();
		}
		else return null;
	}

}
