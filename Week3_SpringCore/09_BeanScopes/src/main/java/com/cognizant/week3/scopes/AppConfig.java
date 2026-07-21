package com.cognizant.week3.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig { @Bean public Employee singletonEmployee() { return new Employee("Singleton Employee"); } @Bean @Scope("prototype") public Employee prototypeEmployee() { return new Employee("Prototype Employee"); } }
