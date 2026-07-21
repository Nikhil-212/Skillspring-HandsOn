package com.cognizant.week2.junit.parameterized;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EvenNumberCheckerTest {
    private final EvenNumberChecker checker = new EvenNumberChecker();
    @ParameterizedTest @ValueSource(ints = {2, 4, 6, 8})
    void acceptsEvenNumbers(int number) { assertTrue(checker.isEven(number)); }
}
