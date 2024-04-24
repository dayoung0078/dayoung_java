package com.ogiraffers.order.dao;

import com.ogiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OderRepository {

    private final ArrayList orders = new ArrayList(); // 마지막 정산서

    public String order(OrderDTO orderDTO) {
        //0
        int oldNum = orders.size();

        orders.add(orderDTO); // 링크는
        //1
        if (oldNum >= orders.size()) {
            return "등록실패";
        }
        int current = orders.size();

        return "등록성공";

    }
}
