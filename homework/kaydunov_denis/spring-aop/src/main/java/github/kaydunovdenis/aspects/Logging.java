package github.kaydunovdenis.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Aspect
public class Logging {
    Logger log = LoggerFactory.getLogger("Logging");

    @Before("execution(* github.kaydunovdenis.service.UserServiceI.createUser())")
    public void logBefore(JoinPoint joinPoint) {
        log.info("*** hijacked in logBefore(): [{}] *** ", joinPoint.getSignature().getName());
    }

    @After("execution(* github.kaydunovdenis.service.UserServiceI.updateUser())")
    public void logAfter(JoinPoint joinPoint) {
        log.info("*** hijacked in logAfter(): [{}] *** ", joinPoint.getSignature().getName());
    }

    @AfterReturning(
            pointcut = "execution(* github.kaydunovdenis.service.UserServiceI.createUser())",
            returning = "capturedResult")
    public void logAfterReturning(JoinPoint joinPoint, Object capturedResult) {
        log.info("*** hijacked in logAfterReturning(): [{}] with return value: result={} *** ",
                joinPoint.getSignature().getName(),
                capturedResult);
    }

    @Around("execution(* github.kaydunovdenis.service.UserServiceI.simpleOperationOnUser(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("*** hijacked in logAround(): [{}] with argument capture: {}",
                joinPoint.getSignature().getName(),
                Arrays.toString(joinPoint.getArgs()));
        log.info("\t\tAround before is running!");

        joinPoint.proceed(); //continue on the intercepted method

        log.info("\t\tAround after is running!");
        log.info("*** hijacked end ***");

    }

    @AfterThrowing(
            pointcut = "execution(* github.kaydunovdenis.service.UserServiceI.riskyOperationOnUser())",
            throwing = "capturedEx")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable capturedEx) {
        log.info("*** hijacked in logAfterThrowing(): [{}] with Exception: {}",
                joinPoint.getSignature().getName(),
                capturedEx.toString());
    }
}
