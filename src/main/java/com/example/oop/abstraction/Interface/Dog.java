package com.example.oop.abstraction.Interface;

import com.example.oop.abstraction.abstractclass.ParentDog;

public class Dog extends ParentDog implements Animal , Animal2{


    @Override
    public void walk() {
        System.out.println("Dog can be walk");
    }

    @Override
    public void eat() {
        System.out.println("Dog can be eat");
    }

    @Override
    public void being() {
        System.out.println("the dog is being");
    }
}
