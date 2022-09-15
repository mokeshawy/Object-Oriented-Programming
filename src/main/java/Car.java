public class Car {

    // Attributes ---> صفات
    int speed;
    String color;
    String model;
    boolean isHatchBack;


    public Car(String model){
        this.model = model;
    }

    //rewrite default constructor.
    public Car(){


    }

    // create a new constructor for new object from class Car
    public Car(int speed , boolean isHatchBack){
        this.speed = speed;
        this.isHatchBack = isHatchBack;
    }

    // create a new custom constructor.

    //Function or methods
    void turnOn() {
        System.out.println("car is being turned on now");
    }

    void brake(){
        System.out.println("Brake");
    }

    void turnedOff(){
        System.out.println("car has been turned off now");
    }
}
