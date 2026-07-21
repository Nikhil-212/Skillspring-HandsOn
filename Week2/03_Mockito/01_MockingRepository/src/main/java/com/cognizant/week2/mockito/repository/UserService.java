package com.cognizant.week2.mockito.repository;

public class UserService { private final UserRepository repository; public UserService(UserRepository repository) { this.repository = repository; } public String getUserName(int id) { return repository.findNameById(id); } }
