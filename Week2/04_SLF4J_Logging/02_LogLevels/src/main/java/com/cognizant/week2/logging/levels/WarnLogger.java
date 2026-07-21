package com.cognizant.week2.logging.levels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WarnLogger { private static final Logger logger = LoggerFactory.getLogger(WarnLogger.class); public static void main(String[] args) { logger.warn("Password will expire soon"); } }
