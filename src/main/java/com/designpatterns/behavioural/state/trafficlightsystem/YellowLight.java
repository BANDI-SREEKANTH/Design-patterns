package com.designpatterns.behavioural.state.trafficlightsystem;

public class YellowLight implements TrafficLightState{
    public void next(TrafficLightContext context)
    {
        System.out.println("Switching from Yellow Light to Red Light");
        context.setState(new RedLight());
    }
    public String getColor()
    {
        return "YELLOW";
    }
}
