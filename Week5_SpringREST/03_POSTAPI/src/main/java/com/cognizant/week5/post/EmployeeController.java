package com.cognizant.week5.post;

org.springframework.web.bind.annotation.PostMapping; import org.springframework.web.bind.annotation.RequestBody; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController;
@RestController @RequestMapping("/employees") public class EmployeeController { @PostMapping public String addEmployee(@RequestBody String employee) { return "Employee added: " + employee; } }
