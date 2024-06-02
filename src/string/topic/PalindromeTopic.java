package string.topic;

public class PalindromeTopic {
    //racecar, noon, dad same in opposite

    // r a c e| c a r
    //0 1 2 3 4 5 6

    // m a d a m
    // 0 1 2 3 4
    //0 != (5-1-0) = 4

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                return true;
                // a Palindrome if equal true
                // if not equal false not a palindrome
                // for palindrome figure out half of the loop need to running
            }
        }
        return false; //method result



    }

    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str));

    }
}
