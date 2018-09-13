package com.qin_vic.demo;

/**
 * 冒泡排序
 * @Author: qin_vic
 * 2018/8/23 17:14
 */
public class DubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,6,8,12,17,23,89};
        bubblingSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubblingSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    swap(arr,j,j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
