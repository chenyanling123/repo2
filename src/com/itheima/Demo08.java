package com.itheima;
/*1.定义一个用于存放班级分数的数组
		int[] score = {80,90,85,90,78,88,89,93,98,75};
	2.求出班级不及格人数(分数低于60分的就是不及格)
	3.求出班级的平均分
	4.求出班级的总分数
	*/

public class Demo08 {
    public static void main(String[] args) {
        int[] score = {80, 90, 85, 90, 78, 88, 89, 93, 98, 75};
        int getLose = medth01(score);
        System.out.println(getLose);
        System.out.println(medth02(score)[0]);
        System.out.println(medth02(score)[1]);
    }

    public static int[] medth02(int[] arr) {
        int[] array = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int avg = 0;
            sum += arr[i];
            avg = sum / arr.length;
            array[0] = sum;
            array[1] = avg;
        }
        return array;
    }

    private static int medth01(int[] score) {
        int count = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                count++;
            }
        }
        return count;

    }


}