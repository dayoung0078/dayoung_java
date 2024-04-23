package com.ohgirappers.section02.encapsulation.problem1;

import com.ogiraffers.section01.user_type.Member;

public class Application01 {

    public static void main(String[] args) {
        MonsterClass DrunkenTiger = new MonsterClass();
        DrunkenTiger.name = "드렁큰타이거"; // 드렁큰타이거 - 인스턴스(하나의 객체)
        DrunkenTiger.hp = -100;

        System.out.println(DrunkenTiger.name);
        System.out.println(DrunkenTiger.hp);
        //  ------ 직접 필드에 접근하면 다음과 같이 -100을 입력해도 오류가 생기지 않는다.

        MonsterClass monster = new MonsterClass();
        monster.name = "주황버섯";
        monster.setHp(-100); //메서드에 직접 접근했다면 괄호가 있어야 한다.
        System.out.println(monster.hp);
        monster.hp = -100; // 필드에 직접 접근함.
        System.out.println(monster.getHp());

        // 내부에서 private하게 관리할 수 있는것을 캡슐화 라고 한다.
        // "필드"는 클래스나 인터페이스 내에 선언된 변수를 가리킵니다.
        // 이 변수들은 클래스나 인터페이스의 상태를 나타내거나 클래스의 동작을 제어하는 데 사용됩니다.
        //필드는 클래스의 멤버 변수로써 클래스의 인스턴스마다 고유한 값을 갖거나
        // 클래스 수준의 정적(static) 변수로서 모든 인스턴스에서 공유할 수 있습니다.


    }
}
