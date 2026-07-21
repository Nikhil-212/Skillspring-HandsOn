package com.cognizant.week3.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main { public static void main(String[] args) { try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) { context.getBean(EmployeeService.class).display(); } } }
