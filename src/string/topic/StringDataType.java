package string.topic;

import java.util.Scanner;

public class StringDataType {

    public static void main(String[] args) {

        printletters("Tasikun Moon");

//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "abcd";
//        //or
//        String str1 = new String("abcd");
//
//        System.out.println(arr);
//        System.out.println(str);
//        System.out.println(str1);
//        //Strings are immutable
//
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next(); // next() used for only single word
//        String name1 = sc.nextLine(); //nextLine() used for sentence
//        System.out.println(name);
//        System.out.println(name1);

        String firstName = "Tasikun";
        String lastName = "Moon";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName.length()); //Tasikun Moon //space also counted in length//






    }
    public static void printletters(String str){

        for (int i = 0; i <str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }


}