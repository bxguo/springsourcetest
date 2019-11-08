package com.aop.register;

import com.aop.dao.CardDao;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: bxguo
 * @time: 2019/11/3 14:28
 */
public class CardDaoFactoryBean implements FactoryBean, InvocationHandler {

    private Class clazz;

    public CardDaoFactoryBean(Class clazz) {
        this.clazz = clazz;
    }
    public Object getObject() throws Exception {
        return Proxy.newProxyInstance(this.getClass().getClassLoader()
                , new Class[]{clazz},this);
    }

    public Class<?> getObjectType() {
        return CardDao.class;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy---------");
        return null;
    }
}
