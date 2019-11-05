package com.aop.cjlib;

import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: bxguo
 * @time: 2019/11/5 9:55
 */
public class CglibTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OrmImpl.class);
        enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
        enhancer.setCallback(new MyCglibInterceptor());

        OrmImpl o = (OrmImpl) enhancer.create();
        o.query();
    }

}
