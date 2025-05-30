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

		// Deep copy example is student has address (Student has one to one association with address object)
		Address address1=new Address("Kesvanagar","DMM");
		Student student1=new Student("sreekanth",24,"CSE",address1);
		Student student2=student1.clone();
		System.out.println("Hashcode of student1 : "+student1.hashCode());
		System.out.println("Hashcode of student1 : "+student2.hashCode());
		System.out.println(student1);
		System.out.println(student2);
		student2.address=new Address("Address changed","Changed City");
		System.out.println("Hashcode of student1 : "+student1.hashCode());
		System.out.println("Hashcode of student1 : "+student2.hashCode());
		System.out.println(student1);
		System.out.println(student2);

		// Deepcopy end

	}

}
