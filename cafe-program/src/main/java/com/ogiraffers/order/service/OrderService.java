package com.ogiraffers.order.service;

import com.ogiraffers.order.dao.OrderRepository;
import com.ogiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderService {

    private final OrderRepository orderRepository = new OrderRepository();
    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.

    public String order(OrderDTO[] orders){
//        if(!orderDTO.getMenuName().equals("아메리카노")){
//            return "주문 실패";
//        }
        for (OrderDTO orderDTO:orders) { // 또 foreach배열 ..ㅠㅠ ㅇㅇ
        if(orderDTO.getPrice() <= 0) { // get 가격을 꺼내옴
            return "장난하냐? 집에서 맥심골드나 먹어라";
        }
    }


        String result = orderRepository.order(orders); // string을 써서 레파지토리도 문자열형이겠구나 유추가능
        // result = 레파지토리의 리턴값 (등록실패 or 등록완료가 반환) 이거맞지?
        return result;
//        return orderRepository.order(orders); <- 한줄로 쓰면 이렇게 됨 ㅇㅋㅇㅋ


    }

    public ArrayList orderRead() {
        ArrayList menuList = orderRepository.orderRead();

        return menuList;
    }

    public OrderDTO orderDetail(int no) {

        OrderDTO order = orderRepository.orderDetail(no);
        return order;

    }

    public String orderDelete(int no) { // 이걸찾아온거잖아 그치?
        String result = orderRepository.orderDelete(no); // 문자열형 결과값
        // 오더레파지토리의 오더딜리트메소드 (매개변수 no)값을 전달한다.
        return result;
    }
}
