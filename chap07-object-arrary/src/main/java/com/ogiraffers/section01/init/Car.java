package com.ogiraffers.section01.init;

public class Car {
    private String modelname;
    private int maxSpeed;
    public Car(String modelname, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.modelname = modelname;

    }

    public void driveMaxSpeed(){
        System.out.println(modelname + "이 최고시속 " + maxSpeed + "km/h로 달립니다.");
    }
}
