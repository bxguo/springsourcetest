package com.aop.log;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author: bxguo
 * @time: 2019/11/6 10:27
 */
public class Slf4jLog {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("Slf4jLog");
        log.info("===main===Slf4jLog");
    }

}
