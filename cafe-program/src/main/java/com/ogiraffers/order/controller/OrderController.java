package com.ogiraffers.order.controller;

import com.ogiraffers.order.dto.OrderDTO;
import com.ogiraffers.order.service.OderService;

public class OrderController {


    private OderService orderService = new OderService();


    public String order(OrderDTO OrderDTO) {
        if (OrderDTO.getMenuName().equals("")){
            return "메뉴를 정해주세요";

        }

        if (OrderDTO.getQuantity() <= 0) {
            return "수량을 입력해주세요";
        }

        // service 로직으로 넘김
        String result = orderService.order(OrderDTO);
        return result;

    } //string

    public String orderDelete(){
        return "주문삭제";
    }

    public String orderModify(){
        return "주문수정";
    }

    public String orderRead(){
        return "주문조회";
    }

    public String orderDetail(){
        return "주문전체조회";
    }

}

