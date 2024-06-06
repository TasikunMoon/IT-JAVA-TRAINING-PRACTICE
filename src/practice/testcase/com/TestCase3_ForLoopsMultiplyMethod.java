package practice.testcase.com;

import java.util.Scanner;

public class TestCase3_ForLoopsMultiplyMethod {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int N = test.nextInt();


       //if (N >= 2 && N <= 20) {
           for (int i = 1; i <= 10; i++) {
               if (N >= 2 && N <= 20) {
                   int result = N * i;
                   System.out.println(N + " X " + i + " = " + result);
               } else {
                   System.out.println("Out of Range");
               }

           }
    }
}
