package com.cognizant.week2.mockito.database;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EmployeeDaoTest { @Test void deletesEmployee() { DatabaseClient client = Mockito.mock(DatabaseClient.class); when(client.executeUpdate("DELETE FROM employees WHERE id=1")).thenReturn(1); assertTrue(new EmployeeDao(client).deleteEmployee(1)); } }
