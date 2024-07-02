package java_basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTopic {
    public static void main(String[] args) {

        //creating an array
        //datatype array variable [] = new datatype [size];
        //datatype []array variable = new datatype [size];
        //datatype []array variable = {value of storing which datatype it depends}

        int[] arrayvalue = new int[3];
        //or
        int arrayvalues[] = new int[3];
        //or
        int arrayvaluess[] = {10, 5, 89, 78, 1010, -98, 565};
        //or
        int[] arrayvaluesss = {10, 30, 89, 10, 200, -98, 505};

        //for each loop:
        for (int valueOfArrayStored : arrayvaluesss) {
            System.out.println(valueOfArrayStored);

            if (valueOfArrayStored == -98) {
                System.out.println("Yeah I found it");
                break;
            }


        }

        System.out.println("length of array = " + arrayvalues.length);
        System.out.println("length of array = " + arrayvaluesss[2]);


        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Length of marks = " + marks.length);


        System.out.println("Phy = " + marks[0]);
        System.out.println("Math = " + marks[1]);
        System.out.println("Che = " + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2] / 3);
        System.out.println("Percentage = " + percentage + " %");


        String names[] = {"mehedi", "karim", "jamal"};
        System.out.println(Arrays.toString(names));
//

        for (String name : names) {
            System.out.println(Arrays.toString(names));
}

// for loop = picking each 1 time
            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }


        }
    }
