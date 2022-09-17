package com.example.oop.composition;

public class Engine {

    private int performance;
    private String oil;
    private boolean isTurbo;


    public Engine(){

    }


    public Engine(int performance, String oil, boolean isTurbo) {
        this.performance = performance;
        this.oil = oil;
        this.isTurbo = isTurbo;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public boolean isTurbo() {
        return isTurbo;
    }

    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
}
