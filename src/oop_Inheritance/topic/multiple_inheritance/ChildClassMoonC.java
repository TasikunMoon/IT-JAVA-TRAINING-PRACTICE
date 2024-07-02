package oop_Inheritance.topic.multiple_inheritance;

//child class
public class ChildClassMoonC implements ParentClassFatherA, ParentClassMotherB{

public void fishing(){

    System.out.println("Like fishing");
}


    @Override
    public void pray() {

    }

    @Override
    public void eat() {
        System.out.println("1");
    }

    @Override
    public void cook() {
        System.out.println("2");
    }
}
