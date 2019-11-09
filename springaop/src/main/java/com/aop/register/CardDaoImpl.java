package com.aop.register;

import org.springframework.stereotype.Service;

/**
 * @author: bxguo
 * @time: 2019/11/4 16:40
 */
@Service
public class CardDaoImpl implements CardDao {

    public void print() {
        System.out.println("cglb");
    }
}
