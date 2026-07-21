package com.cognizant.week2.mockito.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UserServiceTest { @Test void returnsNameFromRepository() { UserRepository repository = Mockito.mock(UserRepository.class); when(repository.findNameById(1)).thenReturn("Asha"); assertEquals("Asha", new UserService(repository).getUserName(1)); } }
