package com.ohgirappers.section02.encapsulation.problem1;

public class MonsterClass {

    //클래스 기반 자료형 집합

    // 몬스터라는 객체는 다양하게 나올 수 있다.
    //공통점 : 체력이 -면 안된다. 무조건 양수여야한다.

    String name;
    int hp;  // 접근제어자 public, private, protected 및 default


    //몬스터의 hp가 0보다 큰 값만 입력될 수 있도록 하여 버그를 막고자함
    public void setHp(int hp){ //setHp시작 // int hp <-매개변수 // sethp <-메소드
        if(hp>0){
            this.hp = hp; // this 는 예약어. this는 클래스 안에서 지저
        }else{
            System.out.println("몬스터의 체력은 0보다 적을 수 없습니다.");
        }

    }//setHp종료

    public int getHp(){
        return this.hp;
    }
}
