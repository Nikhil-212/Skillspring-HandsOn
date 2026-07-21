package com.cognizant.week2.mockito.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherServiceTest { @Test void getsWeatherFromRestClient() { WeatherClient client = Mockito.mock(WeatherClient.class); when(client.getTemperature("Chennai")).thenReturn("30 C"); assertEquals("Temperature: 30 C", new WeatherService(client).getWeather("Chennai")); } }
