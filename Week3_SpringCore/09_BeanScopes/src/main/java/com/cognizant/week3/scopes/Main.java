package com.cognizant.week3.scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main { public static void main(String[] args) { try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) { Employee singletonOne = context.getBean("singletonEmployee", Employee.class); Employee singletonTwo = context.getBean("singletonEmployee", Employee.class); Employee prototypeOne = context.getBean("prototypeEmployee", Employee.class); Employee prototypeTwo = context.getBean("prototypeEmployee", Employee.class); System.out.println("Singleton same object: " + (singletonOne == singletonTwo)); System.out.println("Prototype same object: " + (prototypeOne == prototypeTwo)); } } }
