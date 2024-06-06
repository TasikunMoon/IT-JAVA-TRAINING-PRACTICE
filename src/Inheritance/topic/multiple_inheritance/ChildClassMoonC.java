package Inheritance.topic.multiple_inheritance;

//child class
public class ChildClassMoonC implements ParentClassFatherA, ParentClassMotherB {

public void fishing(){

    System.out.println("Like fishing");
}

    @Override
    public void pray() {
        System.out.println("Pray");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void cook() {
        System.out.println("Cook");
    }
}
