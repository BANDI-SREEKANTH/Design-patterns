package com.designpatterns.creational.builder.Order;

import java.util.Date;
//Order object is final object
public class Order {
    private String orderId;
    private String customerId;
    private String orderItems;
    private String shippingAddress;
    private String billingAddress;
    private String paymentMethod;
    private double totalAmount;

    // Optional parameters
    private String discountCode;             // Optional
    private boolean giftWrap;                // Optional
    private String customerNotes;            // Optional
    private Date preferredDeliveryDate;
    private Order(OrderBuilder orderBuilder)
    {
        this.orderId = orderBuilder.orderId;
        this.customerId = orderBuilder.customerId;
        this.orderItems = orderBuilder.orderItems;
        this.shippingAddress = orderBuilder.shippingAddress;
        this.billingAddress = orderBuilder.billingAddress;
        this.paymentMethod = orderBuilder.paymentMethod;
        this.totalAmount =orderBuilder.totalAmount;
        this.discountCode = orderBuilder.discountCode;
        this.giftWrap =  orderBuilder.giftWrap;
        this.customerNotes =  orderBuilder.customerNotes;
        this.preferredDeliveryDate =  orderBuilder.preferredDeliveryDate;

    }
    public String toString()
    {
        return "Order [ orderId : "+orderId+" customerId : "+customerId+" orderItems : "+orderItems+" shippingAddress : "+shippingAddress+" billing Address : "+billingAddress+"Shipping Address : "+shippingAddress+" totalAmount : "+totalAmount;
    }
    public static class OrderBuilder
    {
        private String orderId;
        private String customerId;
        private String orderItems;
        private String shippingAddress;
        private String billingAddress;
        private String paymentMethod;
        private double totalAmount;

        // Optional parameters
        private String discountCode;             // Optional
        private boolean giftWrap;                // Optional
        private String customerNotes;            // Optional
        private Date preferredDeliveryDate;
        public OrderBuilder(String orderId, double totalAmount, String paymentMethod, String billingAddress, String shippingAddress, String orderItems, String customerId)
        {
            this.orderId = orderId;
            this.customerId = customerId;
            this.orderItems = orderItems;
            this.shippingAddress = shippingAddress;
            this.billingAddress = billingAddress;
            this.paymentMethod = paymentMethod;
            this.totalAmount =totalAmount;
        }
        public OrderBuilder setDiscountCode(String discountCode)
        {
            this.discountCode=discountCode;
            return this;
        }
        public OrderBuilder setgiftWrap(boolean giftWrap)
        {
            this.giftWrap=giftWrap;
            return  this;
        }
        public OrderBuilder setCustomerNotes(String customerNotes)
        {
            this.customerNotes=customerNotes;
            return this;
        }
        public OrderBuilder setPreferedDeliveryDate(Date preferredDeliveryDate)
        {
            this.preferredDeliveryDate=preferredDeliveryDate;
            return this;
        }
        public Order build()
        {
            return new Order(this);
        }
    }
}
