package com.example.aopPractice.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

//1 Configuration
//2 AOP
@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());
    //Pointcut - When?
    // execution(* PACKAGE.*.*(..))
    //execution(* com.example.aopPractice.business.*.*(..))
    @Before("execution(* com.example.aopPractice.*.*.*(..)) ")
    public void logMethodCall(JoinPoint joinPoint){
        //Logging - what?
        logger.info("Before Aspect - {} is called - {}", joinPoint,joinPoint.getArgs());
    }
    @AfterReturning(
            pointcut = "execution(* com.example.aopPractice.*.*.*(..)) ",
            returning = "resultValue"
    )
    public void loadMethodCallAfterExecution(JoinPoint joinPoint, Object resultValue){
        logger.info("After Returning Aspect - {} has returned {} ",joinPoint,resultValue);
    }
    @AfterThrowing(
            pointcut = "execution(* com.example.aopPractice.*.*.*(..)) ",
            throwing = "exception"
    )
    public void loadMethodCallAfterExecution(JoinPoint joinPoint, Exception exception){
        logger.info("After Returning Aspect - {} has thrown {} ",joinPoint,exception);
    }
}
