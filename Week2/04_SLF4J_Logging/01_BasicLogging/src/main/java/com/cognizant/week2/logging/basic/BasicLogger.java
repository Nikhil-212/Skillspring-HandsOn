package com.cognizant.week2.logging.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicLogger {
    private static final Logger logger = LoggerFactory.getLogger(BasicLogger.class);
    public static void main(String[] args) { logger.info("Application started"); }
}
