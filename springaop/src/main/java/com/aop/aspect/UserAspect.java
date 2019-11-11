package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: bxguo
 * @time: 2019/10/28 15:35
 */
@Component
@Aspect
public class UserAspect {

    @Pointcut("execution(* com.aop.dao.*.*(..))")
    public void pintCut(){}

    //@Before("pintCut()&& !args(String)")
    //public void before(){
    //    System.out.println("before-----");
    //}
    //
    //@Before("pintCut() && args(String)")
    //public void before(JoinPoint pjp){
    //    System.out.println(pjp.getArgs()[0]);
    //}

    @Around("pintCut()")
    public void around(ProceedingJoinPoint pjp){
        try {
            System.out.println("aspect---------before---------");
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
