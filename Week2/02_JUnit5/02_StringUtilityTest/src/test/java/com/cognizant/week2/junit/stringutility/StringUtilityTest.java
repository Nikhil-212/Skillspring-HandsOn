package com.cognizant.week2.junit.stringutility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class StringUtilityTest {
    private final StringUtility utility = new StringUtility();
    @Test void reversesText() { assertEquals("avaJ", utility.reverse("Java")); }
    @Test void identifiesPalindrome() { assertTrue(utility.isPalindrome("Madam")); }
}
