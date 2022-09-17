package com.example.oop.composition;

public class Car {

    // Attributes ---> صفات
    int speed;
    String color;
    String model;
    boolean isHatchBack;

    private Engine engine;

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getSpeed(){
        return speed;
    }

    public boolean isHatchBack() {
        return isHatchBack;
    }

    public void setHatchBack(boolean hatchBack) {
        isHatchBack = hatchBack;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //rewrite default constructor.
    public Car(){


    }

    public Car(String model){
        this.model = model;
    }

    // create a new constructor for new object from class com.example.oop.composition.Car
    public Car(int speed , boolean isHatchBack){
        this.speed = speed;
        this.isHatchBack = isHatchBack;
    }

    // create new constructor with composition from engine object.
    public Car(int speed, String color, String model, boolean isHatchBack, Engine engine) {
        this.speed = speed;
        this.color = color;
        this.model = model;
        this.isHatchBack = isHatchBack;
        this.engine = engine;
    }

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
