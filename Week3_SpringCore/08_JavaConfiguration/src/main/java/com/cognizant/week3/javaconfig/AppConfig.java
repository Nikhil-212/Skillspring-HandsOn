package com.cognizant.week3.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig { @Bean public Student student() { return new Student("Kiran"); } @Bean public StudentService studentService(Student student) { return new StudentService(student); } }
