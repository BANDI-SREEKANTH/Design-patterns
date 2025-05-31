package com.designpatterns.behavioural.strategy.Payment;

public class PaymentProcessor {
    Payment paymentType;
    public PaymentProcessor(Payment paymentType)
    {
        this.paymentType=paymentType;
    }
    public void processPayment()
    {
        paymentType.processPayment();
    }
    public void setPaymentType(Payment paymentType)
    {
        this.paymentType=paymentType;
    }
}
