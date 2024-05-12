package main.java.com.ohgiraffers.section01.method;

public class Calculator {

    public static int minNumverOf(int first, int second) {

        return (first < second) ? first : second;
    }

    public static int maxNumberOf(int first, int second) {

        return (first < second)? second : first;
    }


    // static 키워드를 붙여주면 (정적인)static 메모리에 넣어놓고 변하지 않는다. 계속 불러올 수 있음.
    //Calculator <-클래스임.
}
