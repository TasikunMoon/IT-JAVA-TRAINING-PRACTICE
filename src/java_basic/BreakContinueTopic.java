package java_basic;

public class BreakContinueTopic {
    public static void main(String[] args) {

//        for (int i = 1; i <=5; i++){
//            if (i == 3){
//              break;




     for (int i = 1; i <=5; i++) {
         if (3 == 3) {
             continue;
         } else {
             System.out.println(i);
         }

     }
        System.out.println("I am out of the loop");
    }

}
