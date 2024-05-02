package com.ohgiraffers.section02.userexception.exception;

public class Application01 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

//        try {
//
//            et.checkEnoughMoney(-100, 200);
//
//            try {
//                et.checkEnoughMoney(100, -200);
//            } catch (Exception e) {
//                System.out.println("정신차려");
//
//            }
//            catch (Exception e) {
        //Exception은 모든 예외의 최상위 타입으로 아래의 예외를 검사하지 않음
//                System.out.println("상품 가격을 정수로 다시 입력해");
//            }


        try {
            et.checkEnoughMoney(100, 200);
            et.checkEnoughMoney(200, -200);

            et.checkEnoughMoney(10, 200);
        }catch (Exception e) {


        }catch(PriceNegativeException e){
                System.out.println("제품가격이 음수야");
        }catch(MoneyNegativeException e){
                System.out.println("가진 돈이 음수야");
        }catch(NotEnoughMoneyException e){
                System.out.println("제품이 가진돈 보다 비싸");
        }

        try {
        }
    }

    }
