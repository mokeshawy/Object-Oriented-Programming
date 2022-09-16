package com.example.oop.inheritance;

public class Boy extends Person {


    private boolean hadMilitaryService;


    public Boy(String name, String email, int age, double height, String grade, boolean hadMilitaryService) {
        super(name, email, age, height, grade); // this Attributes for parent class Person
        this.hadMilitaryService = hadMilitaryService; // this Attributes for subclass Boy
    }

    public Boy(){
        System.out.println("Im a Boy");
    }


    public void setHadMilitaryService(boolean hadMilitaryService){
        this.hadMilitaryService = hadMilitaryService;
    }

    public boolean getHadMilitaryService(){
        return hadMilitaryService;
    }

}
