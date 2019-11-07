package com.aop.register;

import com.aop.dao.CardDao;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: bxguo
 * @time: 2019/11/3 13:25
 */
public class MyImportBeandefinationRegister implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //获取beanDefinition
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CardDao.class);
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();

        //设置beanDefinition
        //beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(CardDao.class);
        Class<?> proxy = Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                new Class[]{CardDao.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("proxy");
                        return null;
                    }
                }
        ).getClass();
        beanDefinition.setBeanClass(proxy);

        //注册.beanDefinition
        registry.registerBeanDefinition(CardDao.class.getSimpleName(), beanDefinition);
    }
}
