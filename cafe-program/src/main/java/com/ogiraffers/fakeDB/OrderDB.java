package com.ogiraffers.fakeDB;

import com.ogiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderDB {


    private final ArrayList orders;
    private static OrderDB orderDB = new OrderDB();

    private OrderDB(){
        orders = new ArrayList();
        OrderDTO orderDTO = new OrderDTO("아메리카노", 1000, 3);
        orders.add(orderDTO);

    }
                            //함수명
    public static OrderDB getInstance(){ //
        return orderDB;
    }
        //void는 반환형이 없으니까 뒤에 반환형(return)이 없음
    public void setItem(OrderDTO orderDTO){
        orders.add(orderDTO); //.add가 배열추가 하는거? 아...미친..ㅇㅇ 길이 되게 멀다 순례길같아
    }

    public ArrayList getOrders(){ // 주황색 공개범위 흰색이 반환형(return) 파란색은 함수명
        return orders;  // ㅇㅋㅇㅋ 외울게여
    }
}
