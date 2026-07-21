package com.cognizant.week5.validation;

import jakarta.validation.constraints.NotBlank; import jakarta.validation.constraints.NotNull; import jakarta.validation.constraints.Size;
public class EmployeeRequest { @NotBlank @Size(min = 2, max = 50) private String name; @NotNull private Double salary; public String getName() { return name; } public void setName(String name) { this.name = name; } public Double getSalary() { return salary; } public void setSalary(Double salary) { this.salary = salary; } }
