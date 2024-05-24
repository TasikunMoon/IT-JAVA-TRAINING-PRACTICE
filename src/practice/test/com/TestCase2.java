package practice.test.com;

import java.util.Scanner;

public class TestCase2 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int IntegerInput = test.nextInt();
        double DoubleInput = test.nextDouble();
        String StringInput = test.nextLine();


        System.out.println("String = " + StringInput);
        System.out.println("double = " + DoubleInput);
        System.out.println("int = " + IntegerInput);

    }
}
