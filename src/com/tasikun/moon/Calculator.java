package com.tasikun.moon;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       /* System.out.println("Please enter numberA");
        int numberA = input.nextInt();

        System.out.println("Please enter numberB");
        int numberB = input.nextInt();

        int FinalResult = numberA + numberB;
        System.out.println("NumberA & NumberB total sum = "+ FinalResult );/*
   */

        System.out.println("Please enter numberC");
        double numberC = input.nextDouble();

        System.out.println("Please enter numberD");
        double numberD = input.nextDouble();

        double finalResult = numberC - numberD;
        System.out.println("NumberC & NumberD total sum = "+ finalResult );

    }
}
