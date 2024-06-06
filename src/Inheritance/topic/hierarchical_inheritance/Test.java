package Inheritance.topic.hierarchical_inheritance;


public class Test {
    public static void main(String[] args) {

    TasikunB t = new TasikunB();
    NaharC n = new NaharC();
    MoonD m = new MoonD();


    t.pray();
    t.eat();
    t.hobby();
        System.out.println("==========");

    n.pray();
    n.eat();
    n.study();
        System.out.println("===========");

    m.pray();
    m.eat();
    m.work();



    }
}
