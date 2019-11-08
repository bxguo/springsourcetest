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
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CardDaoFactoryBean.class);
        builder.addConstructorArgValue(CardDao.class);


        //设置beanDefinition
        /*GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(CardDao.class);
        beanDefinition.setBeanClass(CardDaoFactoryBean.class);*/

        //注册.beanDefinition
        registry.registerBeanDefinition(CardDao.class.getSimpleName(), builder.getBeanDefinition());
    }
}
