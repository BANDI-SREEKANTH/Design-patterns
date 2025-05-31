package com.designpatterns.behavioural.strategy.Payment;

public class Gpay implements Payment{
    @Override
    public void processPayment() {
        if(verifyDetails())
        {
            System.out.println("Payment Processed successfully through GPay");

        }
        else {
            System.out.println("Oops! Sorry, Payment Failed through GPay");
        }

    }

    @Override
    public boolean verifyDetails() {
        return true;
    }
}
