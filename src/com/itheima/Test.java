package com.itheima;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr=new int[]{1,34,56,77,23,54};
        medth01(arr);
        System.out.println(Arrays.toString(arr));
        medth02(arr);
        medth03(arr);
        medth04(arr);
    }

    private static void medth04(int[] arr) {
        int temp;
        for (int min=0,max=arr.length-1; min<max; min++,max--) {
            temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void medth03(int[] arr) {
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

    private static void medth02(int[] arr) {
            int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
            System.out.println(max);
    }

    private static void medth01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }
    }

}
