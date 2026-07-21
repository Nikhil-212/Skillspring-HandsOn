package com.cognizant.week5.response;

import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.PostMapping; import org.springframework.web.bind.annotation.RestController;
@RestController public class EmployeeController { @GetMapping("/ok") public ResponseEntity<String> ok() { return ResponseEntity.ok("200 OK"); } @PostMapping("/created") public ResponseEntity<String> created() { return ResponseEntity.status(201).body("201 Created"); } @GetMapping("/missing") public ResponseEntity<String> missing() { return ResponseEntity.status(404).body("404 Not Found"); } @GetMapping("/error") public ResponseEntity<String> error() { return ResponseEntity.status(500).body("500 Internal Server Error"); } }
