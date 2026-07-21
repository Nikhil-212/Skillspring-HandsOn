package com.cognizant.week3.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.cognizant.week3.aop")
@EnableAspectJAutoProxy
public class AppConfig { }
