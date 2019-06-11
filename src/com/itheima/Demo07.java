package com.itheima;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 6, 8};
        arr1(arr);
        System.out.println(medth(1, 4, 6)[0]);
        System.out.println(medth(1, 4, 6)[1]);
    }

    public static void arr1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }

    public static int[] medth(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] arr = new int[2];
        arr[0] = sum;
        arr[1] = avg;
        return arr;
    }
}
