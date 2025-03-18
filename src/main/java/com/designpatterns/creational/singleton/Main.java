package com.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("The hashcode of first object is :"+ singleton.hashCode());
        System.out.println("The hashcode of second object is :"+singleton1.hashCode());
    }
}