package com.designpatterns.behavioural.iterator;
import java.util.*;
public class JavaIteratorDemo {
    public static void main(String[] args)
    {
        List<String> singers=new ArrayList<>();
        singers.add("SPB");
        singers.add("Sunitha");
        singers.add("Keeravani");
        singers.add("Mano");
        singers.add("Sailaja");
        singers.add("Kalpana");
        Iterator<String> it=singers.iterator();
        while(it.hasNext())
        {
            System.out.println("Singer is : "+it.next());
        }
    }
}
