package practice.testcase.com;

public class StringInternMethod {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = "Hello";

        // str1 and str2 are different objects
        System.out.println(str1 == str2); // Output: false

        // Intern str1
        str1 = str2.intern();

        // Now str1 and str2 refer to the same object in the string pool
        System.out.println(str1 == str2); // Output: true

    }
}
/*
##String intern() Method:
The intern() method is used to ensure that all strings with the
same contents share the same memory. When a string is interned,
it's added to the string pool. If the string already exists in the pool,
the existing string is returned; otherwise, the new string is added to the pool and returned.

Summary
StringBuffer is a mutable and thread-safe sequence of characters.
The intern() method ensures that strings with the same content share
 the same memory location, which is useful for optimizing memory usage and performance.
By combining StringBuffer and the intern() method, you can efficiently create
 and manage strings in Java.
 */