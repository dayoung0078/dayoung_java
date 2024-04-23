package com.ohgirappers.section03.abstraction.problem3;

public class Application01 {//class

    public static void main(String[] args) {//main
        Car ram = new Car();
        ram.setName("람보르기니");
        Car po= new Car();
        po.setName("포르쉐");

        CarRacer kim = new CarRacer();

        kim.starup(ram);
        kim.go(ram);
        kim.stop(ram);
        kim.turnoff(ram);

    }//main
}//class
