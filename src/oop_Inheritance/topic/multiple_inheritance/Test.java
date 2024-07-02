package oop_Inheritance.topic.multiple_inheritance;


public class Test {
    public static void main(String[] args) {

        ChildClassMoonC m = new ChildClassMoonC();
        m.pray(); //father
        m.eat(); //father
        m.cook(); //mother
        m.fishing(); //child
    }
}
