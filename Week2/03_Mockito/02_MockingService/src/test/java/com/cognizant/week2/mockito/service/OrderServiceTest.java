package com.cognizant.week2.mockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OrderServiceTest { @Test void placesOrderForSuccessfulPayment() { PaymentService payment = Mockito.mock(PaymentService.class); when(payment.process(500)).thenReturn(true); assertEquals("Order placed", new OrderService(payment).placeOrder(500)); } }
