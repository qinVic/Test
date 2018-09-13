package com.qin_vic.demo;

/**
 * Create by: qin_vic
 * 2018/9/1 19:48
 */
public class Demo2 {

    public static void main(String[] args) {
        //System.out.println(new Demo2().test());
        int i = 0;
        method(i);
        i = i++;
        System.out.println(i);
    }

    private int test() {
        int i = 1;

        try {

            return i;
        } finally {
            ++i;
            System.out.println("000000");
        }
    }

    static void method(int i) {
        ++i;
    }

}
