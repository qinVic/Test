package com.qin_vic.demo;

/**
 * Create by qin_vic
 * 2018/9/8 14:17
 */
public class ThreadDemo {

    public static void main(String[] args) {

        new ThreadDemo().call();
    }

    private void call() {

        ThreadDemo2 threadDemo2 = new ThreadDemo2();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {

                        threadDemo2.test2();
                    }
                }
            }).start();




    }


}

class ThreadDemo2 {

    private int i = 0;

    public synchronized void test1() {
        System.out.println(i--);
    }

    public synchronized void test2() {
        System.out.println(i++);
    }

}
