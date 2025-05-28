package com.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
    	
    	// Eager initalization
    	EagerInitalization logger1= EagerInitalization.getInstance();
    	System.out.println("The hashcode of second object is :"+logger1.hashCode());
    	EagerInitalization logger2= EagerInitalization.getInstance();
    	System.out.println("The hashcode of second object is :"+logger2.hashCode());
    	
    	
    	// Lazy initaliztion or On-Demand initalization
    	LazyInitaliztion logger3= LazyInitaliztion.getInstance();
    	System.out.println("The hashcode of second object is :"+logger3.hashCode());
    	LazyInitaliztion logger4= LazyInitaliztion.getInstance();
    	System.out.println("The hashcode of second object is :"+logger4.hashCode());
    	
    	// using synchronized method to avoid multiple threads acessing the method
    	Synchronizedd logger5= Synchronizedd.getInstance();
    	System.out.println("The hashcode of second object is :"+logger5.hashCode());
    	Synchronizedd logger6= Synchronizedd.getInstance();
    	System.out.println("The hashcode of second object is :"+logger6.hashCode());
    	
    	DoubleCheckedLocking logger7=DoubleCheckedLocking.getInstance();
    	System.out.println("The hashcode of second object is : "+logger7.hashCode());
    	DoubleCheckedLocking logger8=DoubleCheckedLocking.getInstance();
    	System.out.println("The hashcode of second object is : "+logger8.hashCode());
    	
    	
    	BillPughSolution logger9= BillPughSolution.getInstance();
    	System.out.println("The hashcode of second object is bill : "+logger9.hashCode());
    	BillPughSolution logger10= BillPughSolution.getInstance();
    	System.out.println("The hashcode of second object is bill : "+logger10.hashCode());
    }
}