package com.cognizant.week2.logging.parameterized;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogger { private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogger.class); public static void main(String[] args) { String user = "Nikhil"; int attempts = 2; logger.info("User {} logged in after {} attempts", user, attempts); } }
