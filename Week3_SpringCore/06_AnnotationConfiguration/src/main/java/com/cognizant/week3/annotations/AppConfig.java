package com.cognizant.week3.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cognizant.week3.annotations")
public class AppConfig { @Bean public String courseName() { return "Spring Core"; } }
