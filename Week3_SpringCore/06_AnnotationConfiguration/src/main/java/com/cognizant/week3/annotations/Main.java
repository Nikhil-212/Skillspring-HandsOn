package com.cognizant.week3.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main { public static void main(String[] args) { try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) { System.out.println(context.getBean(StudentService.class).getStudentName()); System.out.println(context.getBean(StudentComponent.class).getMessage()); System.out.println(context.getBean("courseName", String.class)); } } }
