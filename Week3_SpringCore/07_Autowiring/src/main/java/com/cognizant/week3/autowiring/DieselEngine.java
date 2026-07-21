package com.cognizant.week3.autowiring;

import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine { public String getType() { return "Diesel engine"; } }
