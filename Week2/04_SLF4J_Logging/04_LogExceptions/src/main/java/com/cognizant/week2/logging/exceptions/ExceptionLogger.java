package com.cognizant.week2.logging.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionLogger {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionLogger.class);
    public static void main(String[] args) {
        try { int result = 10 / 0; System.out.println(result); }
        catch (ArithmeticException exception) { logger.error("Calculation failed", exception); }
    }
}
