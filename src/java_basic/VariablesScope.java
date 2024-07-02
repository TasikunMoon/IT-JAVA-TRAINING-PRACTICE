package java_basic;

public class VariablesScope {

    public String name;
    //public static String name;
//here name is field/global variable
    //signature or parameters
//main method
    public static void main(String[] args) {

}


    public void name (String age) {
//if any for input variables  its parameters variable. here (string age) parameter variable
// scope of variables 3 places applicable
        // 1. fields/global variable- after class variable
        //2. signature/parameters variable-any input variable
        //3. local variable - inside code blocks variable
    }

    public void age(String name){

        int a = 10;
     //here a is a local variable
        // age is a field variable
        //name is a signature/parameter variable
    }

    }

