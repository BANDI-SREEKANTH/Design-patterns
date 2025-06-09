package com.designpatterns.behavioural.state.trafficlightsystem;

public class RedLight implements TrafficLightState{
    public void next(TrafficLightContext context)
    {
        System.out.println("Switching from RedLight to Green Light");
        context.setState(new GreenLight());
    }
    public String getColor()
    {
        return "RED";
    }
}
