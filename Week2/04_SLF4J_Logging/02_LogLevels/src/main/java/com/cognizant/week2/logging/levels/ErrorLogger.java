package com.cognizant.week2.logging.levels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorLogger { private static final Logger logger = LoggerFactory.getLogger(ErrorLogger.class); public static void main(String[] args) { logger.error("Unable to connect to server"); } }
