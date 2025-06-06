package com.designpatterns.structural.flyweight.robot;
import java.util.*;
public class RoboticFactory {
    private final static Map<String,Irobot> roboticObjectCache=new HashMap<String,Irobot>();
    public static Irobot createRobot(String type)
    {
        if(roboticObjectCache.containsKey(type))
        {
            System.out.println(type+" already created returning from cache");
            return roboticObjectCache.get(type);
        }
        else
        {
            System.out.println(type+" creating, updating the cache and returning the object");
            if(type.equals("HumaniodRobot"))
            {
                String body="HR";
                Irobot humanRobot=new HumaniodRobot(type,body);
                roboticObjectCache.put(type,humanRobot);
                return humanRobot;
            }
            else if(type.equals("RoboticDog"))
            {
                String body="RD";
                Irobot roboticDog=new RoboticDog(type,body);
                roboticObjectCache.put(type,roboticDog);
                return roboticDog;
            }
        }
        return null;
    }
}
