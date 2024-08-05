package com.example.aopPractice.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

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
}
