package com.cognizant.week2.mockito.verify;

import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RegistrationServiceTest { @Test void sendsRegistrationEmail() { EmailSender sender = Mockito.mock(EmailSender.class); new RegistrationService(sender).register("a@sample.com"); verify(sender).send("a@sample.com", "Registration successful"); } }
