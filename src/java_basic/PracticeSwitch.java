package java_basic;

import java.util.Scanner;

public class PracticeSwitch {
    public static void main(String[] args) {



      //  for (int i = 0; i <5; i++)

        Scanner number = new Scanner(System.in);
        String button = number.next();

        switch (button) {
            case "Cake":
                System.out.println("Available");
                break;
            case "Biscuit":
                System.out.println("Available");
                break;
            default:
                System.out.println("Need to order");
        }
                Scanner button1 = new Scanner(System.in);
                int number1 = button1.nextInt();

                switch (number1) {
                    case 01:
                        System.out.println("January");
                        break;

                    case 02:
                        System.out.println("February");
                        break;

                    case 03:
                        System.out.println("March");
                        break;
                    default:
                        System.out.println("Not found");
                }




        }

    }