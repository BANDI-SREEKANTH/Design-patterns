package com.designpatterns.creational.prototype;

public class Address implements Cloneable{
    public String street;
    public String city;
    public Address(String street, String city)
    {
        this.street=street;
        this.city=city;
    }
    public Address clone() throws CloneNotSupportedException
    {
        return (Address) super.clone();
    }
    public String toString()
    {
        return this.city+" "+this.street;
    }

}
