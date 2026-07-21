package com.cognizant.week5.validation;

import jakarta.validation.Valid; import org.springframework.web.bind.annotation.PostMapping; import org.springframework.web.bind.annotation.RequestBody; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController;
@RestController @RequestMapping("/employees") public class EmployeeController { @PostMapping public EmployeeRequest create(@Valid @RequestBody EmployeeRequest request) { return request; } }
