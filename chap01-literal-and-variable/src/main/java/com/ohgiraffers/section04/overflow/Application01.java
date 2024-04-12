package com.ohgiraffers.section04.overflow;

public class Application01 {

    public static void main(String[] args) {

        //자료형 별 값의 최대 범ㅁ위를 벗어나는 경우 발생한 carry를 버림처리 하고 sing bit를 반전시켜 최소값으로 순환시킴

        byte num1 = 127;
        System.out.println("byte num : " + num1);
        num1++;  // ++증감연산자, 앞으로 뒤로 올수있다. 1을 증가시켜준다

        System.out.println("byte num : " + num1);

        // 2진수 =0,1
        // byte
        // 0000 0000
        // 1111 1111
        // + num1 ->1을 더하면 다시 0으로 돌아가는 2진법

        int firstNum = 100000000;
        int secondNum = 7000000;
        int multi =  firstNum * secondNum;
        System.out.println("firstNum * secondNum; = " + multi);

        long longMulti = firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);

        long result = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + result);






    }
}
