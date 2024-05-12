package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {

        int first = 100;
        int second = 50;
        Calculator cal = new Calculator(); // Calculator cal (Calculator의 줄임말을 내가 만든것)
        int min = cal.minNumverOf(first,second);
        System.out.println(min);

        int max = Calculator.maxNumberOf(first,second);
        System.out.println(max);



    }


}
