package com.ogiraffers.order.dao;

import com.ogiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OderRepository {

    ArrayList orders = new ArrayList();

    public String order(OrderDTO orderDTO) {
        //0
        int oldNum = orders.size();

        orders.add(orderDTO);
        //1
        if (oldNum >= orders.size()) {
            return "등록실패";
        }
        int current = orders.size();

        return "등록성공";

    }
}
