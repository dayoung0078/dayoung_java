package com.ohgiraffers.section01.literal;

public class Application02 {
    public static void main(String[] args){
        // class 내부안에 무조건 존재해야한다. 안그러면 에러뜬다.

        System.out.println(2+2);
        System.out.println(2-2);
        System.out.println(2*2);
        System.out.println(2/2);



        System.out.println(123%10);

        //몫 연산 : 나누고 나서 남은 나머지 값


        System.out.println(1.23+1.23);
        System.out.println(1.23-1.23);
        System.out.println(1.23*1.23);
        System.out.println(1.23/1.23);
        System.out.println(1.23%1.0);

        System.out.println("123"+"12");
        //문자열이기 때문에 계산이 아니라 출력이 된다

        // System.out.println("123"*"12");
        // 문자열은 곱셈 나눗셈 뺄셈 다 안된다., 더하기만 가능함

        System.out.println("123"+12);


    }
}
