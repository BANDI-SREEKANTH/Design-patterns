package com.designpatterns.creational.prototype;

import java.awt.desktop.SystemEventListener;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		// Shallow copy demonostartion  -- Start
		ShallowCopy shallowCopy=new ShallowCopy("alok","250 PM","7","360");
		// cloning the new character info with exising one by doing some tweaks on new object
		System.out.println("The hash code of original character : "+shallowCopy.hashCode());
		ShallowCopy clonedObject=shallowCopy.clone();
		System.out.println("The hash code of cloned character : "+clonedObject.hashCode());
		clonedObject.getCharacterInfo();

		// Shallow copy demonstration -- end - Both objects must have different hash codes

		// Deepcopy example is student has address (Student has one to one association with address object)


		// Deepcopy end

	}

}
