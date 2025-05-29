package com.designpatterns.creational.factory.VehicleFactory;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of vehicle you want? ");
		int n=Integer.parseInt(br.readLine());
		while(n-->0) {
			String vehicleType=br.readLine();
			VehicleFactory factory=new VehicleFactory();
			Vehicle vehicle1=factory.getVehicle(vehicleType);
			if(vehicle1==null){
				System.out.println("Invalid vehicle Type");
				continue;
			}
			vehicle1.getCCofEngine();
			vehicle1.getFuelCapacity();
			vehicle1.getModel();
		}
	}

}
