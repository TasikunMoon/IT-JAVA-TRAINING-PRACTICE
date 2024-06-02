package string.topic;

public class PrintLargestString {
    public static void main(String[] args) {

       //"apple", "mango", "banana"
// str1.compareTo(str2)
        //0: equal   // interview ques
        //<0 : str1 < str2 = -ve
        //>0 : str 1> str2 = +ve
        String fruits[] = {"apple", "mango", "banana", "cherry", "blueberrY", "grape"};
String largest = fruits[0];
        for (int i = 1; i < fruits.length ; i++) {
           if (largest.compareTo(fruits[i])< 0) {
               largest = fruits[i];

           }

        }

        System.out.println(largest);
    }
}
