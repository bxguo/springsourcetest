package com.aop.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: bxguo
 * @time: 2019/10/31 10:16
 */
public class Observer2 implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("Observer2的监控内容 "+ arg);
    }
}
