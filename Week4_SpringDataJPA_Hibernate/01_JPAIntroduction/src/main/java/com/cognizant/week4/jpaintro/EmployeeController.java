package com.cognizant.week4.jpaintro;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController { private final EmployeeService service; public EmployeeController(EmployeeService service) { this.service = service; } @GetMapping public List<Employee> getAll() { return service.getAll(); } }
