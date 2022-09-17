package com.example.oop.abstraction.Interface;

public class Cat implements Animal {

    @Override
    public void walk() {
        System.out.println("Cat can be walk");
    }

    @Override
    public void eat() {
        System.out.println("Cat can be eat");
    }
}
