package java_basic;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

//        double number1 = 0.02;
//        double number2 = 0.03;
//        double result = number2- number1;
//        System.out.println(result);

       //Compare formula
        BigDecimal number1 = new BigDecimal("10.0"); // result showed if greater than BigDecimal came output 1, if equal came 0 and if less than result showed -1
       BigDecimal number2 = new BigDecimal("1.0");
       BigDecimal result = number2.multiply(number1);
        System.out.println(result);
        System.out.println(number2.add(BigDecimal.TEN));
        System.out.println(result.compareTo(BigDecimal.TEN));


        BigDecimal number = BigDecimal.TEN;
        System.out.println(number);
        System.out.println(number.add(BigDecimal.TEN));


    }
}
