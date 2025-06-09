package com.designpatterns.behavioural.state.trafficlightsystem;

public class TrafficLightContext {
    public TrafficLightState currentState;
    public TrafficLightContext()
    {
        currentState=new RedLight();
    }
    public void setState(TrafficLightState currentState)
    {
        this.currentState=currentState;
    }
    public void next()
    {
        currentState.next(this);
    }
    public String getColor()
    {
        return currentState.getColor();
    }
}
