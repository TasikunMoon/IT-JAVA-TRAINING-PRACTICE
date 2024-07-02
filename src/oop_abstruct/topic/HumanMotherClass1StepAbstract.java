package oop_abstruct.topic;

//HumanMotherClass mainly defined Parent Class
public abstract class HumanMotherClass1StepAbstract {

    //regular/non-abstract/concrete method or function/void
    public void religion(){
        System.out.println("Every human have religion");
    }
//return method
    public String eat(){
        return "Biryani";
    }
//abstract method
    public abstract void walk(); //inside abstract class abstract method can contain but no implementation
    //without abstract class not possible to write abstract method
    //in abstract class abstract method not mandatory
    //method only carry main body

}
