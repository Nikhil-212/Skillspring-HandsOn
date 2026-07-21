package com.cognizant.week5.put;

org.springframework.web.bind.annotation.PutMapping; import org.springframework.web.bind.annotation.PathVariable; import org.springframework.web.bind.annotation.RequestBody; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController;
@RestController @RequestMapping("/employees") public class EmployeeController { @PutMapping("/{id}") public String updateEmployee(@PathVariable Long id, @RequestBody String employee) { return "Employee " + id + " updated: " + employee; } }
