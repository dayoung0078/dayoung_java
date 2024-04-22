package com.ohgirappers.section02.encapsulation.problem1;

import com.ogiraffers.section01.user_type.Member;

public class Application01 {

    public static void main(String[] args) {
        MonsterClass DrunkenTiger = new MonsterClass();
        DrunkenTiger.name = "드렁큰타이거";
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


    }
}
