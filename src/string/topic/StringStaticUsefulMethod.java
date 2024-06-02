package string.topic;

public class StringStaticUsefulMethod {
    public static void main(String[] args) {
        String name = "Tasikun";
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(" ".isEmpty()); //output false
        System.out.println("".isEmpty()); // output true
//empty and blank method output came as a boolean result true or false
        System.out.println("this is blank Method = "+name.isEmpty());
        System.out.println("this is blank Method = "+name.isBlank());

        System.out.println(" ".isEmpty());
        System.out.println(" a ".trim());

        String name1[] = { "M", "T", "N"};
String modifyNames = String.join(" & ", name1);
        System.out.println(modifyNames);


    }
}
