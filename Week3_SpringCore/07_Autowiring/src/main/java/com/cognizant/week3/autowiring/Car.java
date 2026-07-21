package com.cognizant.week3.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car { @Autowired @Qualifier("petrolEngine") private Engine engine; public void drive() { System.out.println("Car uses " + engine.getType()); } }
