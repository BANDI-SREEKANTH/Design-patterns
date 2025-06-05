package com.designpatterns.structural.adapter.smartcontrollerapp;

public class AirConditioner {
    public void connectViaBluetooth()
    {
        System.out.println("Connecting to AC via Bluetooth");
    }
    public void startCooling()
    {
        System.out.println("Start Cooling");
    }
    public void stopCooling()
    {
        System.out.println("Stop Cooling");
    }
    public void disConnectViaBluetooth()
    {
        System.out.println("Disconnecting to AC via Bluetooth");
    }
}
