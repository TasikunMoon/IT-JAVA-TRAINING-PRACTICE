package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListTopic {
    public static void main(String[] args) {

        //primitive                  //wrapper class
        //byte                       //Byte
        //short                      //Short
        //int                       //Integer
        //long                      //Long
        //float                     //Float
        //double                    //Double
        //boolean                   //Boolean
        //char                      //Character


        ArrayList <Object>name = new ArrayList<>();
        name.add("T");  //0
        name.add(1); //1
        name.add('M');//2
        name.add(2.5);//3
        System.out.println(name.isEmpty());
        System.out.println(name.size());
        System.out.println(name.get(3));
//object
        //ArrayList   used best for finding,inserting
        ArrayList<String> alist = new ArrayList<>();
        alist.add("k");
        alist.add("L");
        alist.add("M");
        System.out.println("ArrayList = " +  alist.get(2));

        System.out.println("================");

        //LinkedList     used best for removing
        LinkedList<String> llist = new LinkedList<>();
        llist.add("k"); //0
        llist.add("L");
        llist.remove("L");
        llist.add("M"); //1

        System.out.println("LinkedList = " +  llist.get(2));





    }
}
