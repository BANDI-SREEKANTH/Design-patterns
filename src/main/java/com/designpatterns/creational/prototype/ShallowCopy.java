package com.designpatterns.creational.prototype;

// creatintg a character for the game developement like in free-fire having multiple characters
//with minor changes in the character like color, body strength
public class ShallowCopy implements Cloneable{
    public String name;
    public String attackPower;
    public String level;
    public String health;
    public ShallowCopy(String name,String attackPower,String level,String health)
    {
        this.name=name;
        this.health=health;
        this.attackPower=attackPower;
        this.level=level;
    }
    public ShallowCopy clone() throws CloneNotSupportedException
    {
        return (ShallowCopy) super.clone();
    }
    public void getCharacterInfo()
    {
        System.out.print("The character info : [character Name: "+ name+" attack power : "+attackPower+" level : "+level+" health : "+health);
    }
}
