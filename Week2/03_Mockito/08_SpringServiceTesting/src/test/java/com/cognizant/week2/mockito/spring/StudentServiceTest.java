package com.cognizant.week2.mockito.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest { @Mock private StudentRepository repository; @InjectMocks private StudentService service; @Test void findsStudent() { when(repository.existsById(10)).thenReturn(true); assertEquals("Student found", service.getStatus(10)); } }
