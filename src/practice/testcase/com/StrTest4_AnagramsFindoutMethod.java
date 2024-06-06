package practice.testcase.com;

import java.util.Arrays;

public class StrTest4_AnagramsFindoutMethod {

    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "care";

        // Check if the strings are anagrams
        boolean result = areAnagrams(str1, str2);

        // Print the result
        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
           //or (str1.length() == str2.length())
            //or return true;
            return false;
        }

        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);


    }
}

 /*What are Anagrams?

Anagrams are words or phrases that are made by rearranging the letters
of another word or phrase,
typically using all the original letters exactly once. For example:

"listen" and "silent" are anagrams.
"triangle" and "integral" are anagrams.
"race" and "care" are anagrams.

How to Determine if Two Strings are Anagrams?
To determine if two strings are anagrams, we need to ensure that both strings:

Contain the same characters.
Have the same frequency of each character.*/


/*
//Through for loops:

 public class StrTest4_AnagramsFindoutMethod {
    public static void main(String[] args) {
        // Sample input strings
        String str1 = "listen";
        String str2 = "silent";

        // Check if the strings are anagrams
        boolean result = areAnagrams(str1, str2);

        // Print the result
        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create arrays to count the frequency of each character
        int[] charCounts1 = new int[26]; // For str1
        int[] charCounts2 = new int[26]; // For str2

        // Single for loop to update counts
        for (int i = 0; i < str1.length(); i++) {
            charCounts1[str1.charAt(i) - 'a']++;
            charCounts2[str2.charAt(i) - 'a']++;
        }

        // Check if both count arrays are identical
        for (int i = 0; i < 26; i++) {
            if (charCounts1[i] != charCounts2[i]) {
                return false;
            }
        }

        return true;
    }
}
 */