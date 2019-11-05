package com.aop.register;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * //废弃 迁移到CardDaoFactoryBean
 * @author: bxguo
 * @time: 2019/11/3 14:26
 */
public class MyInvocationHandler implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy");
        return null;
    }
}
