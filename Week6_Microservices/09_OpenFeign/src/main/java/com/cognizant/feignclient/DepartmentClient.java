package com.cognizant.feignclient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name = "department-service", url = "http://localhost:8082")
public interface DepartmentClient {
    @GetMapping("/departments")
    String getDepartments();
}
