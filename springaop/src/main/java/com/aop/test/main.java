package com.aop.test;

import com.aop.config.AppConfig;
import com.aop.dao.CardDao;
import com.aop.dao.IndexDaoimpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: bxguo
 * @time: 2019/10/28 15:33
 */
public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CardDao bean = (CardDao) context.getBean("CardDao");
        bean.print();
        IndexDaoimpl bean1 = context.getBean(IndexDaoimpl.class);
        bean1.query();
        List<Object> objects = new ArrayList<Object>();
    }
}
