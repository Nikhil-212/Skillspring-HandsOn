package com.cognizant.week3.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController { @GetMapping("/") public String home() { return "Welcome to Spring MVC"; } }
