package com.designpatterns.creational.builder.Order;

public class Main
{
    public static void main(String[] args)
    {
        Order.OrderBuilder orderBuilder=new Order.OrderBuilder("24",24,"UPI","Kesavanagar","Kadiri gate DMM","I-Phone","24");
        orderBuilder.setCustomerNotes("Be careful while carrying");
        orderBuilder.setgiftWrap(true);
        orderBuilder.setDiscountCode("SREE24");
        Order order=orderBuilder.build();
        System.out.println(order);
    }
}
