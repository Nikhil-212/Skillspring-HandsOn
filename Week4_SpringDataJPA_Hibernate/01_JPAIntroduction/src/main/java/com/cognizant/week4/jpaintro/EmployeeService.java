package com.cognizant.week4.jpaintro;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService { private final EmployeeRepository repository; public EmployeeService(EmployeeRepository repository) { this.repository = repository; } public List<Employee> getAll() { return repository.findAll(); } }
