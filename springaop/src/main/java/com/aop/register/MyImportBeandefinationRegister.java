package com.aop.register;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

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
