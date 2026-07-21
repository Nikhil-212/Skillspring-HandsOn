package com.cognizant.week2.logging.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfiguredLogger { private static final Logger logger = LoggerFactory.getLogger(ConfiguredLogger.class); public static void main(String[] args) { logger.debug("Debug message"); logger.info("Configured logging is active"); } }
