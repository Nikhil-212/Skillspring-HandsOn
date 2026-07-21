package com.cognizant.week3.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.cognizant.week3.aop.EmployeeService.*(..))") public void beforeMethod() { System.out.println("Before service method"); }
    @After("execution(* com.cognizant.week3.aop.EmployeeService.*(..))") public void afterMethod() { System.out.println("After service method"); }
    @Around("execution(* com.cognizant.week3.aop.EmployeeService.*(..))") public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable { System.out.println("Around before"); Object result = joinPoint.proceed(); System.out.println("Around after"); return result; }
}
