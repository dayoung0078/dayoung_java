package com.ogiraffers.order.dto;

public class OrderDTO {

    private String menuName;
    private int price;
    private int quantity;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
                //이름일뿐
    public int getQuantity() { // quantity의 자료형이 숫자형이여야 한다.
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderDTO(String menuName, int price, int quantity) { // constructor 생성자메서드
        this.menuName = menuName;
        this.price = quantity * price;
        this.quantity = quantity;


    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}