package com.cognizant.circuitbreaker;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
@Service
public class DemoService {
    @CircuitBreaker(name = "demoService", fallbackMethod = "fallbackResponse")
    public String unreliableMethod() {
        throw new RuntimeException("Service failed");
    }
    public String fallbackResponse(Throwable t) {
        return "Fallback response: Service is currently unavailable.";
    }
}
