package oop_polymorphism.topic.a.compiletime;

public class InsuranceQuote {

    public void Insurance(String name){
        System.out.println("Single Insurance pay 80% discount");
    }
    public void Insurance(String name1, String name2){
        System.out.println("Joined Insurance pay 40% discount");
    }
    public void Insurance(String name1, String name2, String name3){
        System.out.println("Multiple Insurance pay 30% discount");
    }

}
