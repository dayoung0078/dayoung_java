package com.ohgirappers.section03.abstraction.problem1;

public class Application01 {

    public static void main(String[] args) {

        Car car = new Car();
        CarRacer carRacer = new CarRacer();
        carRacer.setName("김다영");
        // 스캐너와 와일문을 사용하여 계속 돌아가야 하는 상태를 만들 수 있음.
        //자동차에 시동을 건다.
        car.setOn(true);
        if (car.isOn()) {
            System.out.println("시동이 걸렸습니다.");
            System.out.println("자동차를 출발합니다.");
            carRacer.setOn(true);
            if(carRacer.isOn()){
                car.setSpeed(10);
            }
            System.out.println("자동차의 현재 속도" + car.getSpeed() + "km/h");

            if(car.getSpeed() == 0) {
                System.out.println("자동차의 시동을 끕니다");
                car.setOn(false);
            }else{
                System.out.println("자동차를 정지하지 않은 상태에서는 자동차를 멈출 수 없습니다.");
            }

            System.out.println("자동차를 멈추겠습니다.");
            car.setSpeed(0);
            System.out.println("이제 자동차를 정지할 수 있습니다");
            car.setOn(false);


            }
        }



    }

