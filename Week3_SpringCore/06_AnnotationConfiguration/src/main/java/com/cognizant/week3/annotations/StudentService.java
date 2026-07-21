package com.cognizant.week3.annotations;

import org.springframework.stereotype.Service;

@Service
public class StudentService { private final StudentRepository repository; public StudentService(StudentRepository repository) { this.repository = repository; } public String getStudentName() { return repository.findName(); } }
