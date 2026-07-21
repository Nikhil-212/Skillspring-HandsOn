package com.cognizant.week2.junit.exceptions;

public class AgeValidator { public void validate(int age) { if (age < 18) throw new IllegalArgumentException("Age must be at least 18"); } }
