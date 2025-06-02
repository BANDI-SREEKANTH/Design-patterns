package com.designpatterns.behavioural.observer.youtubechannel;

public class EmailSubscriber implements Subcriber {
    String email;
    public EmailSubscriber(String email)
    {
        this.email=email;
    }
    @Override
    public void update(String video)
    {
        System.out.println("Sending an email to "+this.email+"New video is uploaded : "+video);
    }
}
