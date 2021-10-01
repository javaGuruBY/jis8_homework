package com.tutrit.myaop.aspect;

import com.tutrit.myaop.controller.HomeController;
import com.tutrit.myaop.interfaces.MyServiceI;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j(topic = "aspect")
public class LogAdvice {

    @Around("@annotation(LogThis)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("logExecutionTime method {}", joinPoint.getArgs()[0]);
        return joinPoint.proceed();
    }
}
