package com.cognizant.week3.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main { public static void main(String[] args) { try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) { context.getBean(Car.class).drive(); } } }
