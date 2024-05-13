public class PrintReverseNumber {
    public static void main(String[] args) {

        int a = 105689;  // 100% interview question

        while (a > 0) {

            int lastDigit = a % 10; //=10568.9
            //System.out.println(lastDigit + " ");
            System.out.print(lastDigit);
            a = a / 10; // a = 10568/10= 1056. 8
        }
        System.out.println(a);

    }
}