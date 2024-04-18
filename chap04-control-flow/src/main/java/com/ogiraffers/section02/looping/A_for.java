package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement(){ // rawr
        /*
        * [for문 표현식]
        * for(초기식; 조건식; 증감식){
        *  // 조건식이 참인 경우 실행할 구문 == 반복할 구문
        * }
        * */
        /*for (int i =1; i<=10; i++){*/
          //  1번        2번    4번
                //3번 (반복할 구문)
            //최초 실행될때는 초기식을 만듦 규칙 순서임
            //두번째 순서 : 2번 - 3번- 4번 (최초때 초기식을 만들어놨으니까 1번은 빠진다)

     /*   for (int x =  1; x <=10; x++){
            System.out.println("천원 단위 " + x);
        }
            System.out.println("만원 단위: " + i);
        }*/


    }//te

    // 구구단을 만들어주세요!
    public void gugudan(){
      /*  for (int g =1; g<=9;++g){
            for (int d=1; d<=9; ++d) {
                System.out.println(g + "*" + d + "=" + g*d);
            }*/
        for (int i=1; i<=9; ++i) {
            for (int x = 1; x<=9; x++) {

                if((x%i==0) && (i!=1) && (x!=1)){
                    System.out.println(i+"*"+x+"="+i*x);
                }
            }
        }

        }
    public void gugudanTwo()
    {   int i = 2;
        for (int j = i; j <= 9; j++)
        {    // 7 % 2 == 0
            if(j % i == 0 ) //
                for (int y = 2; y <= 9; y++)
                {
                    System.out.println(j + "*" + y + "=" + j * y); // 2 * 3 = 6
                }
        }
    }
// 10명의 이름과 나이를 입력 받아 화면에 출력하기
// 예) 이름 000 나이 20

/*
* 1. 입력받을 공간을 만든다.
* 2.
* 4. 10명을 랜덤으로 나오게 하는
* */

    public void inputInfo(){
    for (int i=1; i<=10; i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("함자가 어떻게 되십니까");
        String name = sc.nextLine();
        System.out.println("춘추가 어떻게 되시오");
        int age = sc.nextInt();
        System.out.println("성함:  " + name + "  춘추:  " + age);
    }

    }

}

