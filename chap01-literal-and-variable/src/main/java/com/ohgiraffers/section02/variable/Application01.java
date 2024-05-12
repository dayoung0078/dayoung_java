package com.ohgiraffers.section02.variable;

public class Application01 {
    public static void main(String[] args) {
        /*
         *변수의 사용 목적
         * 1. 값에 의미를 부여하기 위한 목적
         * 2. 한 번 저장해둔 값을 재사용 하기 위한 목적
         * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.
         */

   System.out.println("======== 값에 의미 부여 테스트 ========");
   System.out.println("보너스를 포함한 급여 : " + (10000000 + 20000000) + "원");

   //백만원 이하는 절삭
        int variable; // 변수 선언문 (앞으로 나는 정수만 저장할거다 라는 선언문) int는 4byte 차지
        variable = 10; // 변수 초기화 (전에 있을 수도 있는 값을 지워주는것)
        /*
        변수(variable)는 C프로그램의 중요한 구성 요소이다.
        값을 저장하기 위한 목적으로 사용된다. 저장된 값은 변경이 이루어지기 전까지 계속 유지된다.
        변수의 값이 바뀌면, 이전의 값은 지워지고 새로운 값이 저장된다. 변수를 사용하려면 선언을 해야 한다.
        선언과 동시에 값을 저장할 수 있다. 이를 초기화(initialization)라고 한다.
         */



        int salary =8;
        int bonus = 2;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        //한 번 저장해둔 값을 재사용하기 위한 목적
        System.out.println("======== 변수에 저장한 갓 재사용 테스트 =========");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 110포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 120포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 130포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 140포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 150포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 160포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 170포인트 지급하였습니다.");

        System.out.println("변수를 사용하는 경우 ");
        int point = 100;
        System.out.println("1번 고객에게 포인트 " + point +"포인트 지급 하였습니다.");
        System.out.println("1번 고객에게 포인트 " +(point+=10)+"포인트 지급 하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point+=10)+"포인트 지급 하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point+=10)+"포인트 지급 하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point+=10)+"포인트 지급 하였습니다.");

        double silver = 0.3;
        double vip = 0.5;
    }
}



