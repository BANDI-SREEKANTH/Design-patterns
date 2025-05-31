package com.designpatterns.behavioural.strategy.Payment;

public class Main {
    public static void main(String[] args)
    {
        Payment creditCardPayment=new CreditcardPayment();
        Payment debitCardPayment=new DebitcardPayment();
        Payment upi=new UPI();
        Payment gpay=new Gpay();
        PaymentProcessor paymentProcessor=new PaymentProcessor(creditCardPayment);
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentType(debitCardPayment);
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentType(upi);
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentType(gpay);
        paymentProcessor.processPayment();

    }
}
