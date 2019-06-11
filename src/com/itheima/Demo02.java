package com.itheima;
//数组名[索引]=数值，变量=数组名[索引]
public class Demo02 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,4,67,45};
        int i=arr[3];
        System.out.println("索引位置为3的数值为："+i);
        arr[1]=88;
        System.out.println(arr[1]);
    }
}
