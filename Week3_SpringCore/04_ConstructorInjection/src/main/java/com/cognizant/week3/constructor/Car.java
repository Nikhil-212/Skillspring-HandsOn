package com.cognizant.week3.constructor;

public class Car { private final Engine engine; public Car(Engine engine) { this.engine = engine; } public void drive() { System.out.println("Car is running: " + engine.start()); } }
