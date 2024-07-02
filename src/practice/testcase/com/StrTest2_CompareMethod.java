package practice.testcase.com;

public class StrTest2_CompareMethod {
    public static void main(String[] args) {
        String str = "Mehedi";
        String str1 = "Syntexpro";
        String str2 = "Mehedis";
        System.out.println(str.equals(str1)+ " "+str.equals(str2)); // result came as a true false
    }

    public static class StrTest1_VowelFigureOutMethod {
        public static void main(String[] args) {

            String str = "abcdefghijklmnpoqrstuvwxyz";
            int vowelCount = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                }
            }
            System.out.println("Number of Vowels = "+ vowelCount);
        }
    }
}
