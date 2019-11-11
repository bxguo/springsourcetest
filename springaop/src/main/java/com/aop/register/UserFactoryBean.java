package com.aop.register;

import com.aop.domain.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: bxguo
 * @time: 2019/11/3 14:28
 */
@Component
public class UserFactoryBean implements FactoryBean {
    public Object getObject() {
        User user = new User();
        user.setAge(12);
        user.setName("foo");
        return user;
    }

    public Class<?> getObjectType() {
        return User.class;
    }
}
