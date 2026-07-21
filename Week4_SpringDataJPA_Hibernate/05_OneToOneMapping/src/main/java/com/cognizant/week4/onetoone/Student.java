package com.cognizant.week4.onetoone;

import jakarta.persistence.CascadeType; import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue; import jakarta.persistence.GenerationType; import jakarta.persistence.Id; import jakarta.persistence.OneToOne;
@Entity public class Student { @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; private String name; @OneToOne(cascade = CascadeType.ALL) private Address address; public Long getId() { return id; } public String getName() { return name; } public void setName(String name) { this.name = name; } public Address getAddress() { return address; } public void setAddress(Address address) { this.address = address; } }
