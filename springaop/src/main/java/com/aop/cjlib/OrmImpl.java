package com.aop.cjlib;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author: bxguo
 * @time: 2019/10/28 15:37
 */
public class OrmImpl {
    @PostConstruct
    public void query() {
        System.out.println("target -----");
    }
}
