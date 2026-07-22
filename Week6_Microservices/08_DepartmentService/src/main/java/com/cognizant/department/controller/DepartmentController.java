package com.cognizant.department.controller;
import com.cognizant.department.entity.Department;
import com.cognizant.department.service.DepartmentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService service;
    public DepartmentController(DepartmentService service) { this.service = service; }
    @PostMapping
    public Department createDepartment(@RequestBody Department department) { return service.saveDepartment(department); }
    @GetMapping
    public List<Department> getAllDepartments() { return service.getAllDepartments(); }
    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id) { return service.getDepartmentById(id); }
}
