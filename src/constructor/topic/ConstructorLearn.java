package constructor.topic;

public class ConstructorLearn {
    public static void main(String[] args) {

//Constructor : special method that is called when an object is instantiated (created)

        Bird birdTuntuni = new Bird("blue", "small");  //Here Bird is a constructor
        System.out.println("T C = " + birdTuntuni.color + " , size = " + birdTuntuni.size);

        Bird birdMoyna = new Bird("grey", "medium");
        System.out.println("M C = " + birdMoyna.color + " , size = " + birdMoyna.size);



        Bird birdParrot = new Bird();


    }
}
