package com.cognizant.week4.onetomany;

import java.util.ArrayList; import java.util.List; import jakarta.persistence.CascadeType; import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue; import jakarta.persistence.GenerationType; import jakarta.persistence.Id; import jakarta.persistence.OneToMany;
@Entity public class Department { @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; private String name; @OneToMany(cascade = CascadeType.ALL) private List<Employee> employees = new ArrayList<>(); public Long getId() { return id; } public String getName() { return name; } public void setName(String name) { this.name = name; } public List<Employee> getEmployees() { return employees; } }
