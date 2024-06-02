package string.topic;

public class StringBuilderBufferTopic {
    public static void main(String[] args) {
        //String builder mostly used
        //String buffer

        //String immutable problem##

        StringBuilder name1 = new StringBuilder("Moon"); // here they didn't create string pool

        System.out.println("String builder Way create String = " + name1);
        for (char i = 'a'; i <= 'z' ; i++){
            name1.append(i);
        }
        System.out.println(name1);
        System.out.println("==============================");

        //String immutable problem###

        String name2 = "Tasikun";
        //System.out.println("Regular String Way create = " + name);//here they create string pool and string pool data can not be changed


        for (char j = 'a'; j <= 'z' ; j++) {
            //System.out.println(name+=i); // name = name+i or name+=i

            System.out.println(name2+=j);
        }
    }
}


//Difference between String, String builder and String Buffer:

/*1. String
     Immutable: Once a String object is created, it cannot be changed. Any modification creates a new String object.
     Thread-Safe: N/A (Since it is immutable, it doesn't require synchronization)
     Performance: Slower for operations that modify the string, due to the creation of new objects.

2. StringBuilder
    Mutable: StringBuilder objects can be modified without creating new objects.
    Thread-Safe: No (Not synchronized)
    Performance: Faster than String for concatenation and other modifying operations due to less overhead.

3. StringBuffer
   Mutable: StringBuffer objects can also be modified.
   Thread-Safe: Yes (Methods are synchronized)
   Performance: Slower than StringBuilder due to synchronization overhead, but faster than String for modifying operations.
 */