package com.cognizant.week4.manytomany;

import java.util.HashSet; import java.util.Set; import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue; import jakarta.persistence.GenerationType; import jakarta.persistence.Id; import jakarta.persistence.ManyToMany;
@Entity public class Student { @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; private String name; @ManyToMany private Set<Course> courses = new HashSet<>(); public Long getId() { return id; } public Set<Course> getCourses() { return courses; } }
