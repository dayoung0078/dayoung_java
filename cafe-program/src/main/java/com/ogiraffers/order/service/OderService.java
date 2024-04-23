package com.ogiraffers.order.service;

import com.ogiraffers.order.dao.OderRepository;
import com.ogiraffers.order.dto.OrderDTO;

public class OderService {

    private  OderRepository orderRepository = new OderRepository();
    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.

    public String order(OrderDTO orderDTO){
        if(!orderDTO.getMenuName().equals("아메리카노")){
            return "주문 실패!";
        }
        if(orderDTO.getPrice() <= 0){
            return "장난하냐? 집에서 맥심골드나 먹어라";

        }

        String result = orderRepository.order(orderDTO);

        return result;

    }
}
