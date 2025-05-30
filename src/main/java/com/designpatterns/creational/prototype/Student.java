package com.designpatterns.creational.prototype;

public class Student implements Cloneable{
    public String name;
    public int id;
    public String branch;
    public Address address;
    public Student(String name,int id,String branch,Address address)
    {
        this.name=name;
        this.id=id;
        this.branch=branch;
        this.address=address;
    }
    public Student clone() throws CloneNotSupportedException
    {
        Student student = (Student) super.clone();
        return new Student(this.name,this.id,this.branch,this.address.clone());
    }
    public String toString()
    {
        return "Student : name"+this.name+" id : "+this.id+" branch : "+this.branch+" address"+ this.address;
    }
}
