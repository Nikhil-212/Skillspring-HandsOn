package com.cognizant.week2.junit.exceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class AgeValidatorTest {
    @Test void rejectsUnderagePerson() { assertThrows(IllegalArgumentException.class, () -> new AgeValidator().validate(17)); }
}
