public class Main {
    public static void main(String[] args) {


        // c1 using custom constructor with model
        Car c1 = new Car("2020");  // c1 is reference of object Car() from memory

        // c2 using default constructor.
        Car c2 = new Car();

        // using a new default constructor. with speed and hatchBack.
        Car c3 = new Car(200,false);
    }
}
