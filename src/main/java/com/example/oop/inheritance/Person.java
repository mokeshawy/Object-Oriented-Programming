package com.example.oop.inheritance;


public class Person {

    private String name;
    private String email;
    private int age;
    private double height;
    private String grade;

    public Person(String name, String email, int age, double height, String grade) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.height = height;
        this.grade = grade;
    }

    public Person(){ //>> this constructor for subclass Boy
        super(); //>> this for default constructor Person parent class
        System.out.println("Im a person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
