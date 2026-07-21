package com.cognizant.week2.junit.stringutility;

public class StringUtility {
    public String reverse(String value) { return new StringBuilder(value).reverse().toString(); }
    public boolean isPalindrome(String value) { return value.equalsIgnoreCase(reverse(value)); }
}
