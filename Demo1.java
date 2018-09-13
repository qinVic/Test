package com.qin_vic.demo;

/**
 * 单例模式
 *
 * @Author: qin_vic
 * 2018/8/25 9:12
 */
public class Demo1 {
    // 饿汉式
    private static Demo1 demo = new Demo1();

    private Demo1() {
    }

    private static Demo1 getDemo1() {
        return demo;
    }

    public static void main(String[] args) {
        Demo1 demo1 = getDemo1();
        Demo1 demo2 = getDemo1();
        System.out.println(demo1 == demo2);
    }
}

class Test {
    // 懒汉式
    private static Test test = null;

    private Test() {
    }

    private static synchronized Test getTest() {
        System.out.println("............................");
        if (test == null) {
            test = new Test();
        }
        return test;
    }

    public static void main(String[] args) {
        Test demo1 = getTest();
        Test demo2 = getTest();
        System.out.println(demo1 == demo2);
    }

}