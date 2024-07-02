package practice.testcase.com;

import java.util.Scanner;

public class TestCase2_DataTypeNextLineMethod {

    public static void main(String[] args) {

        Scanner test = new Scanner(System.in);

       //Input
        int IntegerInput = test.nextInt();
        double DoubleInput = test.nextDouble();

        test.nextLine();
        String StringInput = test.nextLine();




        //Output
        System.out.println("String = " + StringInput);
        System.out.println("double = " + DoubleInput);
        System.out.println("int = " + IntegerInput);

    }
}
