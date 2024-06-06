package practice.testcase.com;

public class StringBufferMethod {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Append a string to the existing buffer
        System.out.println(sb.toString()); // Output: Hello World

        sb.insert(5, ","); // Insert a comma at index 5
        System.out.println(sb.toString()); // Output: Hello, World

        sb.replace(5, 6, ""); // Remove the comma
        System.out.println(sb.toString()); // Output: Hello World

        sb.delete(5, 11); // Delete " World"
        System.out.println(sb.toString()); // Output: Hello

    }
}
/*
##StringBuffer:
In Java, StringBuffer is a mutable sequence of characters, and
the intern() method is used with strings to ensure that
all identical string literals share the same instance.


StringBuffer is used to create mutable (modifiable) strings.
Unlike String, which is immutable, StringBuffer allows for
modifications without creating new objects, which can be more
efficient in certain scenarios.

Summary
StringBuffer is a mutable and thread-safe sequence of characters.
The intern() method ensures that strings with the same content share
the same memory location, which is useful for optimizing memory usage and performance.
By combining StringBuffer and the intern() method, you can efficiently create
 and manage strings in Java.

 */