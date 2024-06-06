package Inheritance.topic.multilevel_inheritance;



public class Test {
    public static void main(String[] args) {

        TasikunDerivedClassC m = new TasikunDerivedClassC();
        m.eat(); //parent
        m.pray(); // parent
        m.fishing(); //child(Moon)
        m.play(); // Derived(Tasikun)
    }
}
