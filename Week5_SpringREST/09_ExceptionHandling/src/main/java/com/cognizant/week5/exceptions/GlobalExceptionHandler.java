package com.cognizant.week5.exceptions;

import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.ControllerAdvice; import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice public class GlobalExceptionHandler { @ExceptionHandler(EmployeeNotFoundException.class) public ResponseEntity<String> handleNotFound(EmployeeNotFoundException exception) { return ResponseEntity.status(404).body(exception.getMessage()); } }
