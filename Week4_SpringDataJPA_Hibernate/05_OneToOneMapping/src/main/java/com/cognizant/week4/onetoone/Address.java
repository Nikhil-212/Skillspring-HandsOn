package com.cognizant.week4.onetoone;

import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue; import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
@Entity public class Address { @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; private String city; public Long getId() { return id; } public String getCity() { return city; } public void setCity(String city) { this.city = city; } }
