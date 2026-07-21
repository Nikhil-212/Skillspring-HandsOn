package com.cognizant.week5.get;

java.util.List; import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController;
@RestController @RequestMapping("/employees") public class EmployeeController { @GetMapping public List<String> getEmployees() { return List.of("Asha", "Ravi"); } }
