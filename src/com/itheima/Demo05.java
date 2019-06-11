package com.itheima;

//数组的最大值与最小值
public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {22, 44, 5, 6, 78, 99, 123, 123};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
//        最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[0]) {
                min = arr[0];
            }
        }
        System.out.println(min);
    }
}
