package com.ogiraffers.section03.branching;

public class A_break { //class 시작

    /*
    * break문 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break) 기본 흐름에 대해 확인
    * */

    public void testSimpleBreakStatement(){
        int i =  2;
        //while문에 test라는 이름을 적어준것
            test:
        while(true){ //while 시작
            if(i>=10){ // if 시작
                break test;
            } //if 종료
            int x = 0;

            while (x <= 9) {
            if (x >= 5) {
                    break ;

                }
                if(x>=5){
                    break;
                }

                if(x == 0 ){ //if 시작
                    x++;
                    continue;

                } //if 종료
                System.out.println(i + "*" + x + "=" + i * x);
                x++;


            }
            i++;

        } // while 종료
    }
} //class 종료
