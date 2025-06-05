package com.designpatterns.structural.adapter.smartcontrollerapp;

// Adapter for Coffee Machine
public class CoffeeMachineAdapter implements SmartDevice {
    private CoffeeMachine coffeeMachine;
    public CoffeeMachineAdapter(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void turnOn() {
        coffeeMachine.initializeZigbeeConnection();
        coffeeMachine.startBrewing();
    }

    @Override
    public void turnOff() {
        coffeeMachine.stopBrewing();
        coffeeMachine.terminateZigbeeConnection();
    }
}

