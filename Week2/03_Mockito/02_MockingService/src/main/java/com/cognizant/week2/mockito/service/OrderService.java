package com.cognizant.week2.mockito.service;

public class OrderService { private final PaymentService paymentService; public OrderService(PaymentService paymentService) { this.paymentService = paymentService; } public String placeOrder(double amount) { return paymentService.process(amount) ? "Order placed" : "Payment failed"; } }
