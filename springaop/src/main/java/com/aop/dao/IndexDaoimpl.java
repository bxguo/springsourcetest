package com.aop.dao;

import org.springframework.stereotype.Repository;

/**
 * @author: bxguo
 * @time: 2019/10/28 15:37
 */
@Repository
public class IndexDaoimpl {
    public void query(){
        System.out.println("query 1 ------");
    }
    public void query2(String str){
        System.out.println("query 2 " + str);
        System.out.println(this.getClass().getResource(""));
        System.out.println(this.getClass().getResource("/"));
        System.out.println(this.getClass().getResource("/").getPath());
        System.out.println(this.getClass().getResource("/").getPath()+"//"+"spring.xml");
    }
}
