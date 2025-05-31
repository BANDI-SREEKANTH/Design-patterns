package com.designpatterns.behavioural.strategy.Payment;

public class DebitcardPayment implements Payment{
    @Override
    public void processPayment() {
        if(verifyDetails())
        {
            System.out.println("Payment Processed successfully through debit card");

        }
        else {
            System.out.println("Oops! Sorry, Payment Failed through debit card");
        }

    }

    @Override
    public boolean verifyDetails() {
        return true;
    }
}
