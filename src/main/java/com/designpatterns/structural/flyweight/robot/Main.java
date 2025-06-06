package com.designpatterns.structural.flyweight.robot;

public class Main {
    public static void main(String[] args)
    {

        Irobot humanoidRobot1= RoboticFactory.createRobot("HumaniodRobot");
        humanoidRobot1.display(1,2);
        Irobot humanoidRobot2= RoboticFactory.createRobot("HumaniodRobot");
        humanoidRobot2.display(4,8);

        Irobot roboticDog1=RoboticFactory.createRobot("RoboticDog");
        roboticDog1.display(10,12);
        Irobot roboticDog2=RoboticFactory.createRobot("RoboticDog");
        roboticDog2.display(16,18);

    }
}
