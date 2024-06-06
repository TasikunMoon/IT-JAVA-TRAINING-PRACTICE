package oop_objectorientedprogramming;

//HumanMotherClass mainly defined Parent Class
public abstract class HumanMotherClass1StepAbstract {

    //regular/non-abstract/concrete method or function
    public void religion(){
        System.out.println("Every human have religion");
    }

    public String eat(){
        return "Biryani";
    }
//abstract method
    public abstract void walk(); //inside abstract class abstract method can contain but no implementation
    //without abstract class not possible to write abstract method
    //in abstract class abstract method not mandatory
    //method only carry main body

}
