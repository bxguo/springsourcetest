package com.aop.test;

import com.aop.Service.AppplloService;
import com.aop.config.AppConfig;
import com.aop.dao.CardDao;
import com.aop.dao.IndexDaoimpl;
import com.aop.register.CardDaoFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;

/**
 * @author: bxguo
 * @time: 2019/10/28 15:33
 */
public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //数据库日志测试
        /*AppplloService bean = context.getBean(AppplloService.class);
        List<Map<String, Object>> list = bean.list();
        System.out.println(list);*/

        //ImportBeanDefinitionRegistrar 测试
        CardDao cardDao = (CardDao)context.getBean("CardDao");
        cardDao.print();

    }
}
