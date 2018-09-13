package com.qin_vic.demo;

/**
 * 单列
 * @Author: qin_vic
 * 2018/8/28 22:00
 */
public class SingleTon {

    private int count = 0;

    public synchronized int getSequence() {
       return ++count;
    }

    // 1.下面是把该类变成单列的代码
    public SingleTon(){}

    public final static SingleTon instance = new SingleTon();

    public static SingleTon getInstance() {
        return instance;
    }

}
