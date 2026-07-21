package com.cognizant.week5.requestparams;

org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.RequestParam; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController;
@RestController @RequestMapping("/employees") public class EmployeeController { @GetMapping public String filter(@RequestParam String department) { return "Employees in " + department; } }
