package com.ogiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car() { //
//        super(); // <-얘가 오류가 안나는 이유 : 태초에 오브젝트가 있었다... 부모위에 오브젝트가 있다.
    }

        /*
        * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
          부모의 기본 생성자를 호출하는 구문이다.
          해당 생성자가 호출 될 시 가장 먼저 Car 클래스 호출 내용이 출력될 것이다.
          명시적, 묵시적 전부 사용 가능하다.*/

//    public Car() {
//        this.runningStatus = isOn;
//        System.out.println("Car 클래스의 기본 생성자 호출됨");
//    }


    public void soundHorn(){
        if(isRunning()){ //달리고 있는 상태
            System.out.println("빵! 빵!"); // true
        }else{ //false
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }
//    private boolean isRunning() { // boolean 타입의 초기화 : false
        boolean isRunning() {
        return runningStatus;
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
}
