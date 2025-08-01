package com.designpatterns.behavioural.momento;

import java.lang.management.MonitorInfo;

public class TextEditor {
    private String text;
    public void setText(String text)
    {
        this.text=text;
    }
    public String getText()
    {
        return this.text;
    }
    public Momento save()
    {
        return new Momento(text);
    }

    public void restore(Momento momento)
    {
        this.text= momento.getText();
    }
}
