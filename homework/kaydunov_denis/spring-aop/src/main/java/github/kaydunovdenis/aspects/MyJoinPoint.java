package github.kaydunovdenis.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class MyJoinPoint {
    Logger log = LoggerFactory.getLogger("Logging");

    @Pointcut("execution(* github.kaydunovdenis.service.*.*(..))")
    public void serviceExecution() {

    }
}
