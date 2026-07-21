package com.cognizant.week2.logging.levels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfoLogger { private static final Logger logger = LoggerFactory.getLogger(InfoLogger.class); public static void main(String[] args) { logger.info("User logged in"); } }
