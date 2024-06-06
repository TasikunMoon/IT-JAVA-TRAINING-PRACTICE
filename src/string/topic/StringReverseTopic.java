package string.topic;

public class StringReverseTopic {
    public static void main(String[] args) {

        String number = String.valueOf(10);
      String number1 = String.format("number %s", number);
        System.out.println(number1);

        //Reverse method through string builder
        StringBuilder name = new StringBuilder("Java is a program");
        name.reverse();
        System.out.println(name);
        System.out.println("=========================");
//OR
        //Reverse method through for loops
        String name1 = "Java is a program";
        String reversed =" ";
        for (int i = name1.length()-1; i >=0 ; i--) {
       reversed+=name1.charAt(i);
            System.out.println(reversed);
        }
    }
}
