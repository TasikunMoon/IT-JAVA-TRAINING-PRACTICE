package string.topic;

import static string.topic.StringDataType.printletters;

public class AppSubstring {

    public static void main(String[] args) {
        //Substring
        //Helloworld = Hello = Substring  old = subsequence
        // helloworld
        //starIndex  endingIndex
        //printletters("Moon")
        String str = "HelloWorld";
        //System.out.println(subString(str, 0, 4));
        //or
        System.out.println(str.substring(0, 4)); //inbuild method
    }

    public static String subString(String str, int startIndex, int endIndex) {
        String substr = " ";
        for (int i = startIndex; i < endIndex; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}





