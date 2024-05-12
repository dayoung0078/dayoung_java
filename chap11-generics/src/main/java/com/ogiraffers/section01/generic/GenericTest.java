package com.ogiraffers.section01.generic;

public class GenericTest<T> // <T> Type의 준말. 타입이 결정되야 한다.
{


    /*
    제네릭 설정은 클래스 선언부 마지막에 다이아몬드 여산자를 이용하여 작성하게 된다.
    다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성한다.
     */

    //value의 타입이 결정되지 않은 상태이다.
    private T value; // 아직 타입이 결정되지 않았기 때문에 놔둘게 라는 뜻

    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericTest{" +
                "value=" + value +
                '}';
    }
}
