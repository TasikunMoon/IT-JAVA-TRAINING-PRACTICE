package com.tasikun.moon;

public class OddEven {
    public static void main(String[] args) {
        //How to find odd and even number

// 4 = even 4/2 = 2
// 1 = odd 1/2 = 565644/2 = if reminder then odd
        //a = 4
        // a%2 = 0 = Even
        //a%2 = reminder = odd
 //Below Ternary operator through programm
        int number = 95;
       String findEvenOdd = (number%2 == 0) ? "Even" : "odd";  //Note: % here work as a modulus to work as a divider
        System.out.println(findEvenOdd);

        int a = 10;
        int b = 5;

        if (a >= b){
            System.out.println("a is the largest");
        } else {
            System.out.println("b is the largest");
        }


    }
}
