package com.aop.register;

import com.aop.cjlib.OrmImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

/**
 * @author: bxguo
 * @time: 2019/11/4 16:40
 */
@Service
@EnableAsync
public class CardDaoImpl implements CardDao {

    public void print() {
        System.out.println("cglb");
    }
}
