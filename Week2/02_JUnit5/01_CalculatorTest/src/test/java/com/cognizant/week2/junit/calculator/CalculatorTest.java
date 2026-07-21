package com.cognizant.week2.junit.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test void addsNumbers() { assertEquals(7, calculator.add(3, 4)); }
    @Test void subtractsNumbers() { assertEquals(2, calculator.subtract(5, 3)); }
}
