package oop_Inheritance.topic.hierarchical_inheritance;

public class Test {
    public static void main(String[] args) {

        DerivedClassB m = new DerivedClassB();
        m.eat();
        m.pray();
        m.fishing();

        System.out.println("=======");

        DerivedClassC n = new DerivedClassC();
        n.eat();
        n.pray();
        n.fishing1();

        System.out.println("======");
        DerivedClassD o = new DerivedClassD();
        o.eat();
        o.pray();
        o.fishing2();




    }
}
