package com.tasikun.moon;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExceptionTopic {
    public static void main(String[] args) {
        // Exception  more interview question
        //Exception can handle 5 ways:
//        1.try
//        2. catch
//        3. finally
//        4. throw
//        5. throws

        //Throwable
      try {
          int value[] = {1, 989, 797, 101};
          System.out.println(value[7]);
      } catch (Exception e) {
          System.out.println(e);
      }

      try {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter a Value");
          int numOneValue = sc.nextInt();

          System.out.println("numberOneValue = " + numOneValue);
          System.out.println("Enter another Value");
          int numtwoValue = sc.nextInt();

          System.out.println("numberTwoValue = " + numtwoValue);
          int result = numOneValue + numtwoValue;

          System.out.println("Final Result = " + result);
      } catch (Exception e) {
          System.out.println(e);
      }
      //next line programm
        System.out.println("Hello Java");

try {
    int a = 5;
    int b = 5;

    int c = a / b;
    System.out.println(c);
} catch (Exception e) {
    System.out.println(e);
}





    }
}
