package com.designpatterns.behavioural.state.trafficlightsystem;

public class TrafficLightSystem {
    public static void main(String[] args)
    {
        TrafficLightContext trafficLight=new TrafficLightContext();
        trafficLight.next(); // switching from the Red to Green
        trafficLight.next(); // switching from the Green to Yellow
        trafficLight.next(); // switching from the Yellow to Red
        trafficLight.next(); // switching from the Red to Green
    }
}
