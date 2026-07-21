package com.cognizant.week2.mockito.matchers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ProductRepositoryTest { @Test void usesArgumentMatchers() { ProductRepository repository = Mockito.mock(ProductRepository.class); when(repository.findByCategory(eq("Books"), anyInt())).thenReturn("Java Basics"); assertEquals("Java Basics", repository.findByCategory("Books", 10)); } }
