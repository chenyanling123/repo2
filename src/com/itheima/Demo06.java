package com.itheima;

import java.util.Arrays;

//数组的反转
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 3, 5, 8, 6, 3, 7, 65, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
}
