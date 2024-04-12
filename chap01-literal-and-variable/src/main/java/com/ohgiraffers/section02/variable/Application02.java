package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args) {

    /*
    *자료형이란/
    * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler(번역)와 약속한 키워드이다. (=예약어)
    * 예) 앞으로 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.,
    * 이러한 자료형은 기본자료형 (primitive type)과 참조자료형(Referance type)으로 나뉘어진다.
    * 그 중 기본자료형 8가지 부터 살펴본다.
     */


        // 정수를 취급하는 자료형은 4가지가 있다.
        //내려갈수록 제곱으로 곱한다.
        byte bnum; // 1byte //byte (예약어이기때문에 주황색) 128
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        // 실수를 취급하는 자료형은 2가지이다.
        float fnum;  // 4byte 8자리만 차지가능
        double dnum; // 8byte 16자리만 차지가능 (더블을 많이씀 플롯은 오류가 많이남)

        // 문자를 취급하는 자료형은 한 가지가 있다.
        char ch;   // 2byte (캐릭터의 줄임말)

        // 논리형을 취급하는 자료형은 한 가지가 있다.
        boolean isTrue;       // 1byte

        //-------------------문자열은 기본자료형은 아니다.
        // 문자열을 취급하는 자료형 (참조자료형)
        String str;         // 4byte

        // 변수 초기화하기
        bnum = 1;
        snum = 2;
        inum = 3;
        lnum = 4L; //int형으로 바뀌기때문에 바이트크기를 고정시켜줘야 함. 그래서 L을 붙임

        //실수에 값을 초기화 하기
        fnum = 0.3f;
        dnum = 0.4f;

        //논리를 취급하는 자료형
        isTrue = true;
        isTrue = false;

        ch = 'A'; //문자를 취급하는 자료값에 값 대입
        ch = 97;
        System.out.println(ch);


        //문자열을 취급하는 자료형에 값 대입
        str = "안녕하세요";



























    }
}
