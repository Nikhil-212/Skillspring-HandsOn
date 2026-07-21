package com.cognizant.week4.mini;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManagementRunner implements CommandLineRunner {
    private final EmployeeRepository repository;
    public EmployeeManagementRunner(EmployeeRepository repository) { this.repository = repository; }
    public void run(String... args) { System.out.println("1. Add Employee 2. Update Employee 3. Delete Employee 4. Search Employee 5. Display All"); System.out.println("Employees: " + repository.findAll().size()); }
}
