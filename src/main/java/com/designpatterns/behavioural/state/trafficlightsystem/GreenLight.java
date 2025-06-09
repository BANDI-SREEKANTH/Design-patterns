package com.designpatterns.behavioural.state.trafficlightsystem;

public class GreenLight implements TrafficLightState{
    public void next(TrafficLightContext context)
    {
        System.out.println("Switching from GreenLight to Yellow light");
        context.setState(new YellowLight());
    }
    public String getColor()
    {
        return "GREEN";
    }
}
