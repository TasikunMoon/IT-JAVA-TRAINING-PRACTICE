package com.tasikun.moon;

import javax.naming.ldap.PagedResultsControl;

public class IfElseStatement {
    public static void main(String[] args) {

        int a1 = 10;
        int b1 = 5;
        if (a1 < b1){
            System.out.println("Today is Rainy day");
        }
        else{
            System.out.println(" Today is shinny day");
        }

        String userID  = "Tasikun";
        String password = "null";
if (userID.equals("tasikun")){
    System.out.println("Welcome to Facebook");
} else {
    System.out.println("Wrong Password");
}


        int a = 10;
        int b = 5;
        int c = 87;

        if ((a > b) && (a < c)) {
            System.out.println("Welcome to my facebook");

        } else if ((a > b) && (b < c)) {
            System.out.println("password wrong");
        }


if ((a>c) || (b<c)) {
    System.out.println("Welcome to my facebook");
} else {
    System.out.println("Logout wrong");
}


        int g = 10;
        int h = 5;
        int k = 30;

if ((g<h) && (h<k)){
    System.out.println("Welcome to my facebook");
} else if ((k>g) && (h<k)) {
    System.out.println("Password ok");
} else {
    System.out.println("Password wrong");
}
// Note: else if used for add condition
        // && always if any compared values showed true/false result will be showed false
        // || always if any compared values showed true/false result will be showed True

        //ternary operator = ?
        //variable = (condition)? statement 1 : statement2 ;

        int age = 16;


if (age >=18) {
    System.out.println("adult : drive : vote");
} else {
    System.out.println("Not adult");
}

   //Different method     String ageResult = (age >= 18) ? "adult : drive : Vote" : "not adult"
        //System.out.println(ageResult);

//How to find odd and even number

// 4 = even 4/2 = 2
// 1 = odd 1/2


        int age1 = 19;
if (age1>=16){
    System.out.println("adult");
} else if (age1>=13 && age1 <18 ) {
    System.out.println("teenager");
} else {
    System.out.println("child");
}
/*int marks = 35;
String result = (marks >33) ? "Pass" : "Fail";
        System.out.println(result);*/
        int marks = 33;
        String result = (marks >33) ? "Pass" : "Fail";
//Note: If else alternative method

    }
}