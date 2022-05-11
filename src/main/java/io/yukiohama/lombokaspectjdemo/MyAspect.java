package io.yukiohama.lombokaspectjdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {

    @Around("@annotation(org.springframework.web.bind.annotation.PostMapping) && execution(* *(..))")
    public Object myAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("MyAspect!!!");
        return joinPoint.proceed();
    }
}
