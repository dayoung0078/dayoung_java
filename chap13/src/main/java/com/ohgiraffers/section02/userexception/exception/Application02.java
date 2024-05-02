package com.ohgiraffers.section02.userexception.exception;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMoney(-2000, 300000);

        }catch(PriceNegativeException e){
            System.out.println("PriceNegativeException가 발생함");
        }catch(MoneyNegativeException e){
            System.out.println("MoneyNegativeException이 발생함");
        }catch(NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException이 발생함");
        }finally {
            sc.close(); //스캐너 더이상 사용 불가능
            System.out.println("오류가 나던 말던 나는 나의 길을 간다.");
        }

        //확장 문법
        try(Scanner sc2 = new Scanner(System.in)){
            System.out.println("제품 가격을 입력해주세요");
        }

        System.out.println("즐쇼~");


    }
}
