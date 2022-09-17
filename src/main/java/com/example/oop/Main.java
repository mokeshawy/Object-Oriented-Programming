package com.example.oop;

import com.example.oop.abstraction.Interface.Cat;
import com.example.oop.abstraction.Interface.Dog;
import com.example.oop.composition.Car;
import com.example.oop.composition.Engine;
import com.example.oop.inheritance.Boy;
import com.example.oop.inheritance.Girl;

public class Main {
    public static void main(String[] args) {


        // c1 using custom constructor with model
        Car c1 = new Car();  // c1 is reference of object com.example.oop.composition.Car() from memory
        c1.setSpeed(300);
        //System.out.println(c1.getSpeed());

        // c2 using default constructor.
        Car c2 = new Car();

        // using a new constructor. with speed and hatchBack.
        Car c3 = new Car(200, false);

        // crete object by new constructor included composition from engine object
        Engine eng = new Engine(300, "total", true);
        Car c4 = new Car(300, "blue", "1997", false, eng);
        //System.out.println("Engine "+c4.getEngine().getPerformance()); //>> this composition

        //Boy b1 = new Boy(); // this object using a default constructor for parent class Person because class boy is subclass
        //b1.setName("Mohamed"); // here boy will be access all data from class person because class boy extend from person.
        //b1.setAge(10);

        //Boy b2 = new Boy("Mohamed", "Email", 10, 100.00, "200 good", false);
        //System.out.println(b2.getName() + " , " + b2.getEmail() + " " + b2.getAge() + " , " + b2.getHeight() + " , " + b2.getGrade() + " , " + b2.getHadMilitaryService());

        //System.out.println("Boy Name : " + b1.getName() + "Age : " + b1.getAge());

        //Girl g1 = new Girl(); // here girl will be access all data from class person because class girl extend from person
        //g1.setName("Dima");
        //g1.setAge(5);
        //System.out.println("Girl Name : " + g1.getName() + "Age : " + g1.getAge());

        Dog dog1 = new Dog();
        dog1.walk();
        dog1.eat();

        Cat cat1 = new Cat();
        cat1.walk();
        cat1.eat();

    }
}
