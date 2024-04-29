package com.ogiraffers.order.dao;

import com.ogiraffers.fakeDB.OrderDB;
import com.ogiraffers.order.dto.OrderDTO;


import java.util.ArrayList;

public class OrderRepository {

    private final OrderDB orderDB = OrderDB.getInstance();

    public String order(OrderDTO[] orders) { //매개변수이자 지역변수??
        //0

        int oldNum = orderDB.getOrders().size(); // size 곧 메모리같은 역할

        for (OrderDTO orderDTO : orders) {
            orderDB.setItem(orderDTO);  // 강사님께 물어보기 레파지토리부분
        }

        if (oldNum >= orderDB.getOrders().size()) {
            return "등록실패";
        }

        return "등록성공";

    }

    public ArrayList orderRead() {

        return this.orderDB.getOrders();

    }

    public OrderDTO orderDetail(int no) {

        OrderDTO order = (OrderDTO) orderDB.getOrders().get(no);
        return order;
    }

    public String orderDelete(int no) {
        int oldSize = orderDB.getOrders().size();
        orderDB.getOrders().remove(no);
        if (orderDB.getOrders().size() >= oldSize) {
            return "주문 취소가 실패하였습니다.";
        }
        return "주문이 취소되었습니다.";
    }
}