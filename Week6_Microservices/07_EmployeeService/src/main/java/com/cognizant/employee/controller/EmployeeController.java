package com.cognizant.employee.controller;
import com.cognizant.employee.entity.Employee;
import com.cognizant.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service) { this.service = service; }
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) { return service.saveEmployee(employee); }
    @GetMapping
    public List<Employee> getAllEmployees() { return service.getAllEmployees(); }
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) { return service.getEmployeeById(id); }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) { service.deleteEmployee(id); }
}
