package com.ogiraffers.order.controller;

import com.ogiraffers.order.dto.OrderDTO;
import com.ogiraffers.order.service.OrderService;

import java.util.ArrayList;

public class OrderController {


    private final OrderService orderService = new OrderService();


    public String order(OrderDTO[] orders) { // () <-매개변수
        //컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        for (OrderDTO orderDTO : orders) {  // foreach문, orders의 길이만큼 반복)
            if (orderDTO.getMenuName().equals("")) {  // equals = 괄호안에 있는게 맞으면
                return "메뉴를 정해주세요";
            }

            if (orderDTO.getQuantity() <= 0) {
                return "수량을 입력해주세요";

            }
        }

        // service 로직으로 넘김  int char flaot double
        String result = orderService.order(orders);
        return result;
    }

    public String orderModify() {
        return "주문수정";
    }


    public String orderDelete(int no) { //주문 삭제
        String result = orderService.orderDelete(no);
        // 결과값은 문자열형이고, orderService에서 오더딜리트라는 함수를 호출하고 매개변수인 (no) 받은 값을 대입?
        // 정확하니? ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ 으 응... ㅇㅋㅇㅋ
        return result;
    }


    public String orderRead() {
        ArrayList orderList = orderService.orderRead();
        String result = "주문 목록 : " + orderList.toString();
        return result;
    }

    public String orderDetail(int no) { //
        if (no < 0) {
            return "메뉴 번호를 잘못 입력하였습니다.";
        }
        OrderDTO orderDTO = orderService.orderDetail(no);
        if (orderDTO == null) {
            return "존재하지 않는 주문입니다.";
        }

        return orderDTO.toString();

    }

}





