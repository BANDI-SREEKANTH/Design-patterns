package com.designpatterns.structural.adapter.smartcontrollerapp;

// Adapter for Air Conditioner
public class AirConditionerAdapter implements SmartDevice {
    private AirConditioner airConditioner;
    // Constructor
    public AirConditionerAdapter(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void turnOn() {
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    @Override
    public void turnOff() {
        airConditioner.stopCooling();
        airConditioner.disConnectViaBluetooth();
    }
}
