package com.designpatterns.structural.adapter.smartcontrollerapp;

import java.util.Locale;
import java.util.Scanner;

public class UglyCode {
    public static void controlDevice(String device)
    {
        if(device.equals("ac"))
        {
            System.out.println("Control your AC now");
        }
        else if(device.equals("tv"))
        {
            System.out.println("Control your TV Now");
        }
        else if(device.equals("coffeemachine"))
        {
            System.out.println("Control your Coffee machine Now");
        }
        else if(device.equals("camera"))
        {
            System.out.println("Control your camera Now");
        }
        else
        {
            System.out.println("Device Not supported!!");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Supported Devices : Tv, AC, camera, Coffee machine");
        System.out.println("Enter the supported devices: ");
        Scanner sc=new Scanner(System.in);
        String device;
        while (true) {
            device = sc.next().toLowerCase();
            controlDevice(device);
            System.out.println("Enter exit if you want to exit from app");
            if(device.equals("exit"))
            {
                System.out.println("Exiting from the control app");
                break;
            }
        }
    }
    /*

     */

}
