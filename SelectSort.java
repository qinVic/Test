package com.qin_vic.demo;

/**
 * 选择排序
 * @Author: qin_vic
 * 2018/8/28 22:11
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = { 70, 3, 6, 17, 10, 2, 1 };
        selectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * 选择排序
     * @param arr
     */
    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }

            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }


    }

}
