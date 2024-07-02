package collection_framework;

import java.util.HashMap;

public class MapTopic {
    public static void main(String[] args) {

        HashMap<Integer, String> hello = new HashMap<>();
        HashMap<Integer, String> hello1 = new HashMap<>();
        //Hashmap <2 data type> and Hashset <1 for data type>
        //Any 2 data type method I can choose
        hello.put(1, "Tasikun");
        hello.put(2, "Nahar");
        hello.put(3, "Moon");
        hello.put(4, "T");
        hello.put(5, "N");
        hello.put(6, "M");

        hello1.put(1, "Tasikuns");
        hello1.put(2, "Nahar");
        hello1.put(3, "Moon");
        hello1.put(4, "T");
        hello1.put(5, "N");
        hello1.put(6, "M");


        System.out.println(hello.isEmpty());
        //Clear method --> all clear void
        //hello.clear();
       //size method --> return -int
        System.out.println(hello.size());
        //Empty method ---> return true or false
        System.out.println(hello.isEmpty());
        //get method
        System.out.println(hello.get(102));

        //hello.clone();
        System.out.println("Original hello hashmap = "+ hello);
        System.out.println("Original hello1 hashmap = "+ hello1);
        //System.out.println("Cloned hashmap = "+hello.clone());
        //contain method ---> return true or false

        System.out.println(hello.containsKey(5));
        //replace method ---> its replaced data
        hello.replace(5, "Begum");
        System.out.println(hello);

        //values method ---> return showed showed without numbering value
        System.out.println(hello.values());
       //Equal method --> 2 Hashmap need comparison and make to another hashmap for compare
        System.out.println(hello.equals(hello1));
    }
}
