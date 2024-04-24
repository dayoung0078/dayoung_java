package com.ogiraffers;

import com.ogiraffers.order.controller.OrderController;
import com.ogiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application { //class

    public static void main(String[] args) { //main
        Scanner sc = new Scanner(System.in);
        OrderController oc = new OrderController();
        boolean order = true;
        String result = "";


        while (order){

            System.out.println("1.주문 등록");
            System.out.println("2.주문 삭제");
            System.out.println("3.주문 수정");
            System.out.println("4.주문 상세조회");
            System.out.println("5.주문 전체조회");
            System.out.println("어떤 메뉴를 동작하시겠나요?");
            int input = sc.nextInt();
            sc.nextLine();


            switch (input) {
                case 1: // 등록
                    System.out.print("주문할 메뉴 이름을 등록해주세요 : ");
                    String menuName= sc.nextLine();

                    System.out.println("수량을 입력해주세요. : ");
                    int quantity = sc.nextInt();

                    System.out.println("가격을 입력해주세요 : ");
                    int price = sc.nextInt();

                    OrderDTO orderfianl = new OrderDTO(menuName,quantity,price);
                    System.out.println(orderfianl.toString());

                    orderfianl.setQuantity(quantity, price);
                    result = oc.order(orderfianl);
                    System.out.println("주문하신 내역은  " + menuName + " 이고 " + " 갯수는 " + quantity + " 개 " + " 가격은 " + (price*quantity) + " 원 입니다.");
                    break;
                case 2: // 삭제
                    oc.orderDelete();
                    break;
                case 3: // 수정
                    oc.orderModify();
                    break;
                case 4: // 상세조회
                    oc.orderRead();
                    OrderDTO orderdetail = new OrderDTO(menuName,quantity,price);
                    System.out.println(orderdetail.toString());
                    orderdetail.setQuantity(quantity, price);

                    break;
                case 5: // 전체조회
                    oc.orderDetail();
                    break;
                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }//switch

            System.out.println(result);


            System.out.println("주문을 종료하시겠습니까?");
            order = sc.nextBoolean();

        } //while
    } //main
}//class
