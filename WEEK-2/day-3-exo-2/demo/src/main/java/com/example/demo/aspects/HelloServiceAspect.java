package com.example.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {
//    @Before("execution(* com.example.demo.services.HelloService.hello(..))")
//    public void before(JoinPoint joinPoint) {
//        System.out.println("before execution");
//    }
//    @After("execution(* com.example.demo.services.HelloService.hello(..))")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("after execution");
//    }
//    @AfterReturning("execution(* com.example.demo.services.HelloService.hello(..))")
//    public void afterReturning(JoinPoint joinPoint) {
//        System.out.println("after returning");
//    }
//
//    @AfterThrowing("execution(* com.example.demo.services.HelloService.hello(..))")
//    public void afterThrowing(JoinPoint joinPoint) {
//        System.out.println("after throwing");
//    }

    @Around("@annotation(com.example.demo.services.TimeIt)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        String log = joinPoint.getSignature().getName() + "method takes : " +  (endTime - startTime) + "ms";
        System.out.println(log);
        return result;
    }
}
