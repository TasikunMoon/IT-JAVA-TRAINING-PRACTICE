package com.tasikun.moon;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

       int[] a = new int[5];
        System.out.println(a.length);
        a[0] = 5;  //array length important & it's count start from 0 instead of 1 in physical count
        a[1] = 10;
        a[2] = 11;      // interview question
        a[3] = 13;
        a[4] = 16;
        System.out.println(a[3]);

       // System.out.println(Arrays.toString(a)); from int to string call

        String[] name = new String[2];
        name[0] = "Tasikun";
        name[1] = "Moon";
        System.out.println(name[0]);


        int[] numbers = new int[6];
        Arrays.fill(numbers, 50); // here this one fill all same date except if I mention separately with number then only that values showed and others showed with fill data number
        numbers[2] = 70;
        numbers[5] = 60;
        System.out.println(Arrays.toString(numbers));







    }
}
