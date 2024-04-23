package com.ohgirappers.section03.abstraction.problem1;

import com.ohgirappers.section03.abstraction.problem2.Car;

public class CarRacer {
  private String name;

  private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

