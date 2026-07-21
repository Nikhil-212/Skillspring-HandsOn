package com.cognizant.week3.setter;

public class Student { private Laptop laptop; public void setLaptop(Laptop laptop) { this.laptop = laptop; } public void study() { System.out.println("Student studies using " + laptop.getBrand()); } }
