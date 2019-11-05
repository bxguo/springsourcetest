package com.aop.cjlib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: bxguo
 * @time: 2019/11/5 10:16
 */
public class MyCglibInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before Method Invoke");
        methodProxy.invokeSuper(o, objects);
        System.out.println("After Method Invoke");
        return o;
    }

}
