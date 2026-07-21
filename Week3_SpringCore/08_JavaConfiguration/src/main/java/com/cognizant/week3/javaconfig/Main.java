package com.cognizant.week3.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main { public static void main(String[] args) { try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) { context.getBean(StudentService.class).displayStudent(); } } }
