package com.cognizant.week5.delete;

org.springframework.web.bind.annotation.DeleteMapping; import org.springframework.web.bind.annotation.PathVariable; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController;
@RestController @RequestMapping("/employees") public class EmployeeController { @DeleteMapping("/{id}") public String deleteEmployee(@PathVariable Long id) { return "Employee " + id + " deleted"; } }
