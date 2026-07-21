package com.cognizant.week3.javaconfig;

public class StudentService { private final Student student; public StudentService(Student student) { this.student = student; } public void displayStudent() { System.out.println("Student: " + student.getName()); } }
