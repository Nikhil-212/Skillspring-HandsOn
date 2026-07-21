package com.cognizant.week2.mockito.database;

public class EmployeeDao { private final DatabaseClient client; public EmployeeDao(DatabaseClient client) { this.client = client; } public boolean deleteEmployee(int id) { return client.executeUpdate("DELETE FROM employees WHERE id=" + id) == 1; } }
