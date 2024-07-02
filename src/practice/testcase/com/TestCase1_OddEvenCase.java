package practice.testcase.com;

import java.util.Scanner;

public class TestCase1_OddEvenCase {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int n = test.nextInt();

        if (n % 2 == 0) {
           System.out.println("You entered an even number = " + n);
        } else {
            System.out.println("You entered an odd number = " + n);
        }


       /* if (n % 2 != 0){
            System.out.println("Weird");
        }*/
         if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        }
        else if (n >= 6 && n <= 20) {
           System.out.println("Weird");
        }
        else if (n > 20) {
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Nothing");
        }

// odd and even figure out formula  Even (n == 0); (Odd n != 0)
            }
        }


