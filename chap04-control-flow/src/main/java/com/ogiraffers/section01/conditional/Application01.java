package com.ogiraffers.section01.conditional;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요.: ");

    }

//0.calculator 메서드를 만든다.
//1. 첫번째 수를 입력받으세요 => 뭘로 입력받을지 생각(아침에배움)
//2. 두번째 수를 입력받으세요
//3. 연산 기호를 입력받으세요
//4. 연산 기호를 확인한다.
//5. 연산을 진행한다.
//6. 반환한다.

    // calculator 메서드를 만든다.
    public double calculator() {
// 입력 받을 수 있는 기능을 추가한다.
        Scanner sc = new Scanner(System.in);
// 첫번째 수를 입력 받는다.
        int first = sc.nextInt();
// 두번째 수를 입력 받는다.
        int second = sc.nextInt();
// 연한기호를 입력받는다.
        char operator = sc.nextLine().charAt(0);
// 연산기호를 확인한다.
        double result;
        if (operator == '+') {
            result = first + second;
        } else if (operator == '-') {
            result = first - second;
        } else if (operator == '*') {
            result = first * second;
        } else {
            result = first / second;
        }
        return 0.0;
    }

    public String call() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split("");
        int result = 0;
        if (target[1] == "+") {
            result = Integer.parseInt((target[0]) + Integer.parseInt(target[2]));
        }
        return "" + result;
    }
}




