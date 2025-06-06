package com.designpatterns.structural.flyweight.robot;

public class HumaniodRobot implements Irobot{
    String type;
    String body; // actually, it was imaged to render in UI in games
    public HumaniodRobot(String type,String body)
    {
        this.type=type;
        this.body=body;
    }
    public String getType()
    {
        return this.type;
    }
    public String getBody()
    {
        return this.body;
    }
    @Override
    public void display(int x, int y) {
        System.out.println("The object type : "+this.type+" is rendering and body is : "+this.body
                + "at position X : "+x+" and Y : "+y);
    }

}
