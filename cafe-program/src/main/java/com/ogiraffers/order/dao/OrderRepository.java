package com.ogiraffers.order.dao;

import com.ogiraffers.fakeDB.OrderDB;
import com.ogiraffers.order.dto.OrderDTO;


import java.util.ArrayList;

public class OrderRepository {

    private final OrderDB orderDB = OrderDB.getInstance();

    public String order(OrderDTO[] orders) { //매개변수이자 지역변수??
        //0

        int oldNum = orderDB.getOrders().size(); // size 곧 메모리같은 역할
       // oldNum <-기존의 배열이라는 뜻..아! 등록하기 전 배열의 길이/ 배열의 길이(size)를 구하는 메서드

        for (OrderDTO orderDTO : orders) { // 등록하는 작업
            orderDB.setItem(orderDTO);  // 과외샘한테 과외 완료 ㅠㅠㅇㅋㅇㅋ어렵네..
        } // orderDB라는 클래스에 setitem이라는 메서드에 매개변수로 orderDTO를 넘긴다. (

        if (oldNum >= orderDB.getOrders().size()) {
            return "등록실패"; //기존의 배열 길이가 / 16번째줄의 oldnum은 19번째줄 이전
            //아 등록전이랑 후랑 다르니까? 등록전이 등록후보다 작거나 같으면 등록이안된거니까 등록실패라고 반환
        } /// (큰 한숨)

        return "등록성공";  // 작거나 같지 않으면 등록이 된거니 등록성공으로 반환ㅠㅠ

    }

    public ArrayList orderRead() {

        return this.orderDB.getOrders();

    }

    public OrderDTO orderDetail(int no) {

        OrderDTO order = (OrderDTO) orderDB.getOrders().get(no);
        return order;
    }

    public String orderDelete(int no) { // ㅇㅋㅇㅋ 똑같네..
        int oldSize = orderDB.getOrders().size(); // 정수형 기존데이터DB 배열 크기 = int oldSize
        //
        orderDB.getOrders().remove(no);
        if (orderDB.getOrders().size() >= oldSize) {
            return "주문 취소가 실패하였습니다.";
        }
        return "주문이 취소되었습니다.";
    }
}