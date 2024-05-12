package com.ogiraffers.section01.conditional;


import java.util.Scanner;

//D_switch라는 클래스를 모두가 사용할 수 있도록 만든다.
public class D_switch {
    // 클래스 내부 속성

    public void testSimpleSwichStatement() {  // { <-testSimpleSwitchstatement 메서드의 시작
        // testSimpleSwichStatement라는 반환값이 없는 메서드를 모두가 사용할 수 있도록 만든다.

        /*
         * [switch문 표현식]
         * switch(비교대상값){
         *   case 비교값 : 비교값이 참일 경우 실행할 구문; break;
         *   case 비교값 : 비교값이 참일 경우 실행할 구문; break;
         *   default : case에 모두 해당하지 않는 경우 ; break;
         * }
         * */

        Scanner sc = new Scanner(System.in);
        // 사용자한테 값을 입력받을 수 있는 객체를 생성함
        System.out.println("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        //사용자가 입력한 값을 정수로 받아서 first에 대입함
        System.out.println("두 번째 정수 입력 : ");
        //사용자가 입력한 값을 second라는 변수에 정수로 받아서 대입함
        int second = sc.nextInt();
        //사용자의 화면에 연산 기호를 입력하라고 출력함.
        System.out.println("연산 기호 입력 : ");
        //사용자가 입력한 연산 기호를 문자로 받아서 op에 대입함
        char op = sc.next().charAt(0);

        //아래의 계산기를 완성합니다.
        //연산은 + - * /가 가능하며 이외는 계산 불가능이라는 결과를 화면에 출력합니다.

        switch (op) { // op의 변수를 기준으로 아래의 값과 일치하는지 확인함
            case '+':
                System.out.println(first + second);
                ;
                break;
            // op가 +와 같다면 first + second 결과를 화면에 출력함.
            case '-':
                System.out.println(first - second);
                ;
                break;
            // op가 -와 같다면 first - second 결과를 화면에 출력함.
            case '*':
                System.out.println(first * second);
                ;
                break;
            // op가 *와 같다면 first * second 결과를 화면에 출력함.
            case '/':
                System.out.println(first / second);
                ;
                break;
            // op가 /와 같다면 first / second 결과를 화면에 출력함.
            default:
                System.out.println("같지 않음");
                break;
            // op가 위의 수식에 모두 만족하지 않으면 같지 않음을 출력함
        }


    } //testSimpleSwitch 메서드의 종료

    // 계산기를 만들고 결과를 반환합니다. (switch를 이용함) 반환된 결과는 application02에서 출력해주세요.
    //+ - / * 만 제공하고 일치하는 연산이 없는 경우 연산불가라는 결과를 출력하고 반환 값을 0.0으로 합니다.

    public double switchCalculator() { // D_switch의 시작
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수 입력 : ");
        int num2 = sc.nextInt();
        System.out.println("연산 기호 입력 : ");
        char op = sc.next().charAt(0);
        double result = 0.0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 + num2;
                break;
            case '*':
                result = num1 + num2;
                break;
            case '/':
                result = num1 + num2;
                break;
            default:
                System.out.println("연산 불가");
                break;
        }
        return result;
    } // D_switch의 종료

    //1. 메서드를 만든다.
    public void gradeCal(int score){
        String grade;
        if(score == 100) {
            grade = "A+";
        }else if(score <100 && score >= 90) {
                grade = "A";
        }else if(score < 85 && score >= 75) {
                grade = "B+";
        }else if(score < 75 && score >= 60) {
                grade = "C";
        }else { grade = "D";}
        }
    } //D_switch의 종료

    //2. 점수의 범위를 구분한다.
    //3. 출력한다.

    //등급 계산기 프로그램 if
    //main에서 학생의 성적을 입력받고 이래의 메서드에서 학생의 등급을 화면에 출력해주세요
    //100 =a+
    //100~90 = a
    //89~85 = b+
    //84~75 = b
    //74~60 = c
    //60 미만 d
    //F는 없다.






