package string.topic;

public class StringCompare {
    public static void main(String[] args) {

        String s1 = "T";
        String s2 = "T";
        String s3 = new String("T");
//
//        if (s1==s2)(wrong){ // string level not used '=='  for compare need to use .equal()
//            System.out.println("Strings are equal");
//        } else {
//            System.out.println("Strings are not equal");
//        }


        if (s1.equals(s3)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }

}
