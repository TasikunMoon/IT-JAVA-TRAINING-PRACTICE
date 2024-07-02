package oop_Inheritance.topic.hybrid_inheritance;

public class DerivedClassD extends ChildClassMotherB implements InterfaceClassMoonC {
   public void play(){
       System.out.println("Class D");
   }

    @Override
    public void fishing() {
        System.out.println("Class C");

    }
}

