package com.example.oop;

import com.example.oop.inheritance.Boy;
import com.example.oop.inheritance.Girl;

public class Main {
    public static void main(String[] args) {


        // c1 using custom constructor with model
        Car c1 = new Car();  // c1 is reference of object com.example.oop.Car() from memory
        c1.setSpeed(300);
        //System.out.println(c1.getSpeed());

        // c2 using default constructor.
        Car c2 = new Car();

        // using a new default constructor. with speed and hatchBack.
        Car c3 = new Car(200,false);


        Boy b1 = new Boy(); // this object using a default constructor for parent class Person because class boy is subclass
        b1.setName("Mohamed"); // here boy will be access all data from class person because class boy extend from person.
        b1.setAge(10);

        Boy b2 = new Boy("Mohamed","Email",10,100.00,"200 good",false);
        System.out.println(b2.getName() +" , "+ b2.getEmail() +" "+ b2.getAge() +" , "+ b2.getHeight() +" , "+ b2.getGrade() +" , "+ b2.getHadMilitaryService());

        System.out.println("Boy Name : "+b1.getName() + "Age : "+b1.getAge());

        Girl g1 = new Girl(); // here girl will be access all data from class person because class girl extend from person
        g1.setName("Dima");
        g1.setAge(5);
        System.out.println("Girl Name : "+g1.getName() + "Age : "+g1.getAge());



    }
}
