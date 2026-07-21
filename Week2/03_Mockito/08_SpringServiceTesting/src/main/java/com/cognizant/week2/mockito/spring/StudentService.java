package com.cognizant.week2.mockito.spring;

public class StudentService { private final StudentRepository repository; public StudentService(StudentRepository repository) { this.repository = repository; } public String getStatus(int id) { return repository.existsById(id) ? "Student found" : "Student not found"; } }
