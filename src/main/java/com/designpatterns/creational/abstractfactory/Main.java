package com.designpatterns.creational.abstractfactory;

import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Creating BMW Factory
		VehicleFactory BMWFactory=new BMWFactory();
		Vehicle BMW=BMWFactory.creteVehicle();
		BMW.getModel();
		BMW.getFuelCapacity();

		// creating TM Factory
		VehicleFactory TMFactory=new TMFactory();
		Vehicle TM=TMFactory.creteVehicle();
		TM.getModel();
		TM.getFuelCapacity();

		// creating MG Factory
		VehicleFactory MGFactory=new MGFactory();
		Vehicle MG=TMFactory.creteVehicle();
		MG.getModel();
		MG.getFuelCapacity();
	}

}
