package com.designpatterns.behavioural.state.trafficlightsystem;

interface TrafficLightState {
    public void next(TrafficLightContext context);
    public String getColor();
}
