package com.itheima;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
//        数组的最值
        int [] arr={12,45,3,4,5,7,89,33,66,27};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        for (int num1=0,num2=arr.length-1; num1>num2; num1++,num2--) {
            int temp=arr[num1];
            arr[num1]=arr[num2];
            arr[num2]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
//    反转数组

}
