package practice.testcase.com;
//4 replace built in method
public class StrTest3_ReplaceMethod {
    public static void main(String[] args) {
        String strOriginal = "syntexpro";
        String strOriginal1 = "syntexpro java, syntexpro python ";
        String strOriginal2 = "syntexpro java, syntexpro python ";

        System.out.println("Original = " + strOriginal);
        System.out.println("Original1 = " + strOriginal1);
        System.out.println("Original2 = " + strOriginal2);


        System.out.println("==============");

        String strReplaced = strOriginal.replace('e', 'a'); //replace char formula only for single digit
        String strReplaced1 = strOriginal.replace("syntexpro", "syntaxpro"); //replace target formula for all full word
        String strReplaced2 = strOriginal1.replaceAll("syntexpro", "This is Java"); //replaceall formula for full sentence
        String strReplaced3 = strOriginal2.replaceFirst("syntexpro", "This is IT");  //replacefirst formula for first word in sentence


        System.out.println("Replaced = " + strReplaced);
        System.out.println("Replaced1 = " + strReplaced1);
        System.out.println("Replaced2 = " + strReplaced2);
        System.out.println("Replaced3 = " + strReplaced3);



    }
}
