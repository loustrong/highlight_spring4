package com.tom.DemoApp.highlight_spring4.chapter01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * LogAspect
 *
 * @author Tom on 2021/2/14
 */

@Component
@Aspect
public class LogAspect {
    @Pointcut("@annotation(com.tom.DemoApp.highlight_spring4.chapter01.aop.Action)")
    public void annotationPointCut(){
        System.out.println("annotationPointCut");
    }
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("method after execute:" + action.name());
    }
    @Before("execution(* com.tom.DemoApp.highlight_spring4.chapter01.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("Method before execute:" + method.getName());
    }
}
