package com.ogiraffers.section02.extend;

public class RabbitFarm <T extends Rabbit> { //이 타입은 래빗의 자손들만 들어올 수 있게 가능하게끔 함

    private T animal;

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
