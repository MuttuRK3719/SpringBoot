package com.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
    Logger LOGGER = LoggerFactory.getLogger(AspectClass.class);

    //    only these methods are executes when u must call in main method
    @Pointcut("execution(public * com.calculator.CalculatorImp.substract(*,*))")
    void injection() {
    }

    @Before("injection()")
    void BeforeEntry(JoinPoint joinPoint) {
        LOGGER.info("Entry to {} with parameters are {}", joinPoint.getSignature(), joinPoint.getArgs());
    }

    @After("injection()")
    void AfterEntry(JoinPoint joinPoint) {
        LOGGER.info("After running{} with parameters are {}", joinPoint.getSourceLocation(), joinPoint.getKind());
    }
}
