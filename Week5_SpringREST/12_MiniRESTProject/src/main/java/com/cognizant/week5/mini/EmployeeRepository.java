package com.cognizant.week5.mini;

import java.util.List; import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> { List<Employee> findByDepartment(String department); List<Employee> findByNameContaining(String name); }
