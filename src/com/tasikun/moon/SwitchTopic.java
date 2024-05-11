package com.tasikun.moon;

import java.util.Scanner;

public class SwitchTopic {
    public static void main(String[] args) {
        /*int number = 3;

        switch (number){
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Cofee");
                break;
            case 3:
                System.out.println("Singara");
                break;


  //in switch method default mandatory
            default:
                System.out.println("wake up")};*/


        Scanner number1 = new Scanner(System.in);

        String button = number1.next();

        switch (button) {
            case "Jan":
                System.out.println("01");
                break;
            case "Feb":
                System.out.println("02");
                break;
            case "Mar":
                System.out.println("03");
                break;
            case "Apr":
                System.out.println("04");
                break;

            default:
                System.out.println("Not Available");

        }



    }
}
