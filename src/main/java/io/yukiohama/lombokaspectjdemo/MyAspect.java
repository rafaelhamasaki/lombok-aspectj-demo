package io.yukiohama.lombokaspectjdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
public class MyAspect {

    @Around("@annotation(org.springframework.web.bind.annotation.PostMapping) && execution(* *(..))")
    public Object myAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Aspect is working");
        return joinPoint.proceed();
    }
}
