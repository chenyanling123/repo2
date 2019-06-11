package com.itheima;

public class Demo04 {
    public static void main(String[] args) {
        int [] arr1={1,3,4,6,7};
        int [] arr2=new int[]{1,3,5,6,5};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(i);
        }
        short[] arr3=new short[5];
        arr1[0]=3;
        System.out.println(arr1.length);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr1[0]);
        arr3[3]=5;
        int i=arr3[3];
        System.out.println(i);
        System.out.println(arr3[0]);
        for (int i1 = 0; i1 < arr1.length; i1++) {
            System.out.println(i1);
        }


    }
}
