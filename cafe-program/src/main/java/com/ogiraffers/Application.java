package com.ogiraffers;

import com.ogiraffers.order.controller.OrderController;
import com.ogiraffers.order.dto.OrderDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class Application { //class

    public static void main(String[] args) { //main이 들어있는 ap이 메인인가?
        Scanner sc = new Scanner(System.in);
        OrderController oc = new OrderController();
        boolean order = true; //기본데이터유형 변수의 초기값을 true로 설정
        String result = ""; //string 클래스의 result 변수는 비어있는 값 = ""


        while (order){ //while 반복문의 상단에서 지정한 order 라는 변수이름

            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.println("어떤 메뉴를 동작하시겠나요?");
            int input = sc.nextInt();       // char '남'\n
            sc.nextLine();


            switch (input) { // "input"은 프로그램이 처리할 데이터나 정보를 받는 데 사용되는 용어
                case 1: // 등록
                    System.out.println("몇 번의 주문을 하시겠나요?");
                    int cnt = sc.nextInt();
                    sc.nextLine(); //정수형이나 문자형에만 적용됨.     // 5\n      \n <-엔터 역할 (
                    OrderDTO[] orders = new OrderDTO[cnt];
                    for (int i = 0; i < orders.length; i++) {
                        System.out.println("주문할 메뉴 이름을 등록해주세요 : ");
                        String menuName = sc.nextLine();


                        System.out.println("수량을 입력해주세요. : ");
                        int quantity = sc.nextInt();

                        System.out.println("가격을 입력해주세요 : ");
                        int price = sc.nextInt();

                        orders[i] = new OrderDTO(menuName, quantity, price);
                    }
                    result = oc.order(orders);
                    break;


                case 2: // 삭제
                    System.out.println("삭제할 제품의 번호를 입력해주세요");
                    int no = Integer.parseInt(sc.nextLine());
                    result = no + "번 ";
                    result += oc.orderDelete(no);
                    break;

                case 3: // 수정
                    oc.orderModify();
                    break;

                case 4 : // 상세조회
                    System.out.println(oc.orderRead());
                    System.out.println("상세 조회할 제품 번호를 입력해주세요");
                    int num = sc.nextInt();
                    sc.nextLine();
                    result = oc.orderDetail(num);
                    break;

                case 5: // 전체조회
                    result = oc.orderRead();
                    break;

            default:
                System.out.println("입력이 잘못되었습니다.");
                break;
            }

            System.out.println(result);


            System.out.println("주문을 종료하시겠습니까?");
            order = sc.nextBoolean();

        } //while
    } //main
}//class
