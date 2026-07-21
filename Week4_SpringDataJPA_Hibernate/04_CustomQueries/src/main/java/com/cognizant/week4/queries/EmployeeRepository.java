package com.cognizant.week4.queries;

import java.util.List; import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> { List<Employee> findByName(String name); List<Employee> findByDepartment(String department); List<Employee> findBySalaryGreaterThan(double salary); }
