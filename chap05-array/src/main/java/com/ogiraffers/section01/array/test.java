package com.ogiraffers.section01.array;

import java.util.Scanner;

public class test {//test 시작



    /*
     * A학생의 평균 점수를 구하는 프로그램을 만들어주세요.
     * 시험의 과목은 5개로 점수는 정수 단위입니다.
     * 5개 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다.
     * 예 ) A학생의 수학 : 90점, 영어 80점 , 국어 : 100점, 과학 : 70점, 사회 : 80점 이며 평균은 X 입니다.
     * double[] score = new double[5]
     * */
    public void avg(){//avg 시작
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int result = 0;
        for (int i = 0; i < scores.length; i++) {//for1시작
            System.out.print("점수 를 입력하세요");
            scores[i] = sc.nextInt();
            result += scores[i];
        }//for1끝
        double avg = result / scores.length;

        String[] subject = {"수학", "영어", "국어", "과학", "사회"};

        for (int i = 0; i < scores.length; i++) {//for2시작
            System.out.print(subject[i] + " : " + scores[i] + " ");
        }//for2끝

        System.out.println("평균점수 : " + avg);
    } //avg끝
}//test끝


// 1. 5개 과목을 적는다.
// 2. 학생 이름을 입력받는다.
// 3. 5개 과목의 점수를 입력받는다.
// 4. 평균을 계산한다(점수를 모두 더하고 나눈다)
// 5. 구한 평균을 출력한다.


// [ 과목배열을 주면 과목의 점수를 입력받아서 배열로 반환하는 프로그램 ]
// 1. 입력받을 장치 : 스캐너클래스
// 2. 입력받을 공간 : 배열
// 3. 입력받기 과목 수 만큼 for문
// 4. 평균값 반환

// [ 이름을 입력받는 프로그램 ]
// 1. 입력받을 장치 : 스캐너클래스
// 2. 입력받을 공간 : String에 바로 입력값 넣기
// 3. 반환하기

// [ 점수배열을 주면 평균을 반환하는 프로그램 ]
// 1. 합계를 담을 공간
// 2. 합산하기
// 3. 평균 계산하기
// 4. 반환하기