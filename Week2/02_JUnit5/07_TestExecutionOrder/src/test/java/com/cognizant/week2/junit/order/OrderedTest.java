package com.cognizant.week2.junit.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderedTest {
    @Test @Order(1) void firstTest() { System.out.println("First test"); }
    @Test @Order(2) void secondTest() { System.out.println("Second test"); }
}
