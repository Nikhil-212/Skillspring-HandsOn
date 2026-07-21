package com.cognizant.week2.mockito.rest;

public class WeatherService { private final WeatherClient client; public WeatherService(WeatherClient client) { this.client = client; } public String getWeather(String city) { return "Temperature: " + client.getTemperature(city); } }
