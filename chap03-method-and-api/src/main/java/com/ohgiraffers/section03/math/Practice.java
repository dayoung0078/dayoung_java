package main.java.com.ohgiraffers.section03.math;

public class Practice {
    public static void main(String[] args) {

        Practice apple = new Practice();

        int result = apple.lemon(123);   // lomon 함수 불러온건데 값을 1000을 넣을거임.
        System.out.println(result);
        int result1 = apple.lemon(12);
        System.out.println(result1);


    }

    public int lemon(int x){        // 접근제어자 중 하나, 반환타입, 우리가 정한 함수이름, 매개변수,
        // int x;  여기가 우리눈에
        // x=123;  보이지 않지만 이미 처리되고 있는 구역
        return x;
    }

}

//효연
