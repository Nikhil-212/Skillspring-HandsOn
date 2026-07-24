package com.example.ai.controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin("*")
public class AiController {
    @PostMapping("/prompt")
    public Map<String, String> generateResponse(@RequestBody Map<String, String> request) {
        String prompt = request.get("prompt");
        Map<String, String> response = new HashMap<>();
        response.put("response", "Mock AI Response for: " + prompt);
        return response;
    }
}
