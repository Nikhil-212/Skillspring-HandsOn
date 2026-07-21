package com.cognizant.week2.mockito.verify;

public class RegistrationService { private final EmailSender emailSender; public RegistrationService(EmailSender emailSender) { this.emailSender = emailSender; } public void register(String address) { emailSender.send(address, "Registration successful"); } }
