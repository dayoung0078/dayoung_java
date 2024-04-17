package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {
        /*
         * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
         * */
        /*
         * 변수의 종류 (각각 범위가 따로 있다.)
         * 1. 지역변수 :
         * 2. 매개변수 : 둘 사이에서 양편의 관계를 맺어주면서, 어떤 관계나 범위 안에서 여러가지 값으로 변할 수 있는 가변적 요소이다.
         * 3. 전역변수(필드) :
         * 4. 클래스(static) 변수 : 언제나 쓸수있게 메모리에 올려놓는 것.
         * */
        /*
         * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프(범위)라고 한다.
         * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
         * 이 때 전달하는 값을 전달인자(argument)라고 부르고
         * 메소드 선언부 괄호안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
         * 스코프 : 범위
         * 인자(argument) " 어떤 사물의 원인이 되는 낱낱의 요소나 물질 "
         * */



        int age = 20;
        Application02 app1 = new Application02();
        app1.testMethod(age);

    }

    public void testMethod(int age) {
        System.out.println("age"+age);

    }

 }





