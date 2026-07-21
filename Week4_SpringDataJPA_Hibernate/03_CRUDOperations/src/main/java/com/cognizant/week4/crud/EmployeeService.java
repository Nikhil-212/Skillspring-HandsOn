package com.cognizant.week4.crud;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService { private final EmployeeRepository repository; public EmployeeService(EmployeeRepository repository) { this.repository = repository; } public Employee insert(Employee employee) { return repository.save(employee); } public Employee update(Long id, Employee employee) { Employee saved = repository.findById(id).orElseThrow(); saved.setName(employee.getName()); return repository.save(saved); } public void delete(Long id) { repository.deleteById(id); } public Employee findById(Long id) { return repository.findById(id).orElseThrow(); } public List<Employee> findAll() { return repository.findAll(); } }
