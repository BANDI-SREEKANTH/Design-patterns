package com.designpatterns.behavioural.strategy.Payment;

public class CreditcardPayment implements Payment{
    @Override
    public void processPayment() {
        if(verifyDetails())
        {
            System.out.println("Payment Processed successfully through credit card");

        }
        else {
            System.out.println("Oops! Sorry, Payment Failed through credit card");
        }

    }

    @Override
    public boolean verifyDetails() {
        return true;
    }
}
