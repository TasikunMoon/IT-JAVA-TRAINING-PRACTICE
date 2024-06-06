package Inheritance.topic.hybrid_inheritance;


public class Test {
    public static void main(String[] args) {

        DerivedClassD d = new DerivedClassD();
d.pray();  //Data from A Parents Class
d.eat();   //Data from A Parents Class
d.cook();  //Data from B Child Class through Extends from A
d.fishing(); //Data from C using Interface Class through interface
d.play(); //Data from D Derived Class through Extends B & implements C
    }
}