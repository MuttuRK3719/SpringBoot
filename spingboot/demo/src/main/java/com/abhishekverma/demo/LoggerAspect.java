package com.abhishekverma.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
    private final Logger LOGGER = LoggerFactory.getLogger(LoggerAspect.class);

    @Pointcut("execution(public String com.abhishekverma.service.serviceimp.OwnerServiceImp.findOwner())")
    public void injectExpression() {

    }

    @Before("injectExpression()")
    public void beforeExecution(JoinPoint joinPoint) {
        LOGGER.info("Entered " + joinPoint.getSignature() + " with arguments " + joinPoint.getArgs());
    }

    @After("injectExpression()")
    public void afterExecution(JoinPoint joinPoint) {
        LOGGER.info("Completed {} with {}", joinPoint.getSignature(), joinPoint.getArgs());
    }

    @AfterReturning(pointcut = "injectExpression()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, String result) {
        LOGGER.info("Executed with {} the value is {}", joinPoint.getSignature(), result);
    }

    @AfterThrowing(pointcut = "injectExpression()", throwing = "exception")
    public void afterThrowingException(JoinPoint joinPoint, Throwable exception) {
        LOGGER.info("Caught exception for method {} message is {}", joinPoint.getSignature(), exception.getMessage());
    }

    @Around("injectExpression()")
    public Object logAroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("Around Entered to method {} ,with {}", joinPoint.getSignature(), joinPoint.getArgs());
        Object object = joinPoint.proceed();
        LOGGER.info("After invoking message is :{}", object);
        return object;
    }
}
