package com.designpatterns.structural.adapter.smartcontrollerapp;

public class SmartHomeController {
    public static void main(String[] args) {
        // Create adapters for each device
        SmartDevice airConditioner =
                new AirConditionerAdapter(new AirConditioner());
        SmartDevice smartLight = new SmartLightAdapter(new SmartLight());
        SmartDevice coffeeMachine = new CoffeeMachineAdapter(new CoffeeMachine());
        // Control devices through the unified interface
        airConditioner.turnOn();
        airConditioner.turnOff();
        smartLight.turnOn();
        smartLight.turnOff();
        coffeeMachine.turnOn();
        coffeeMachine.turnOff();
    }
}
