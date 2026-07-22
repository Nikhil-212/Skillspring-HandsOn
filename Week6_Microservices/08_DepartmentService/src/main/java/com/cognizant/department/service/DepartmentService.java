package com.cognizant.department.service;
import com.cognizant.department.entity.Department;
import com.cognizant.department.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DepartmentService {
    private final DepartmentRepository repository;
    public DepartmentService(DepartmentRepository repository) { this.repository = repository; }
    public Department saveDepartment(Department department) { return repository.save(department); }
    public List<Department> getAllDepartments() { return repository.findAll(); }
    public Department getDepartmentById(Long id) { return repository.findById(id).orElse(null); }
}
