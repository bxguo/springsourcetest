package com.aop.test;

import com.aop.config.AppConfig;
import com.aop.register.CardDao;
import com.aop.register.CardDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: bxguo
 * @time: 2019/10/28 15:33
 */
public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //ImportBeanDefinitionRegistrar 测试
        /*CardDao cardDao = (CardDao)context.getBean("CardDao");
        cardDao.print();*/

        //数据库日志测试
        //AppplloService bean = context.getBean(AppplloService.class);
        //List<Map<String, Object>> list = bean.list();
        //System.out.println(list);

        CardDao cardDao = (CardDao) context.getBean("CardDao");
        cardDao.print();

    }
}
