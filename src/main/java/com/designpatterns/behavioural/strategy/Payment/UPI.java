package com.designpatterns.behavioural.strategy.Payment;

public class UPI implements Payment{
    @Override
    public void processPayment() {
        if(verifyDetails())
        {
            System.out.println("Payment Processed successfully through UPI");

        }
        else {
            System.out.println("Oops! Sorry, Payment Failed through UPI");
        }

    }

    @Override
    public boolean verifyDetails() {
        return true;
    }
}
