package com.designpatterns.behavioural.momento;

public class Momento
{
    private final String text;
    public Momento(String text)
    {
        this.text=text;
    }
    public String getText()
    {
        return this.text;
    }
}
