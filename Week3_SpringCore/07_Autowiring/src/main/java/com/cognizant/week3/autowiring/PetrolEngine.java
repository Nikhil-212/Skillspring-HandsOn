package com.cognizant.week3.autowiring;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine { public String getType() { return "Petrol engine"; } }
