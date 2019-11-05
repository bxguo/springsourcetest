package com.aop.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: bxguo
 * @time: 2019/10/31 10:09
 */
public class BxObservable extends Observable {

    public void fun(){
        System.out.println("fun---");
        setChanged();
        notifyObservers("fun---");
    }
}
