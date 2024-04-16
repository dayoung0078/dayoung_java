package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    // class - 하나의 자료형임
    public static void main(String[] args) {
        /*
         * 메소드
         * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다. (ex println)
         * 함수 : 동적인 기능을 담당.
         * */

        //System.out.println("X");

        //1을 넣었는데 D가 나오면 잘못된 것. 외부환경에 의해 영향을 받고 있는 것.
        //어떠한 걸 넣어도 결과가 동일하게 나오는 녀석임. 이걸 순수함수라고 함.


        System.out.println("main() 시작됨....");
        //메서드 안에 메서드를 다시 넣을 수 없다.

        Application01 app1 = new Application01();
        app1.methodA();

        // app1.main();
        // .은 참조연산자 (ex 이상우.에어팟 <- 이상우의 에어팟)

        //(하나의 자료형으로 만들 수 있는데 레퍼런스타입(참조자로형)이라고 부른다)

        System.out.println("main() 종료됨....");
    }


    public void methodA() {
        System.out.println("methodA()를 시작됨");
        methodB();
        System.out.println("methodA()를 종료됨");
        return;  //<-void는 반환값이 없기때문에 리턴을 써도 에러는 나지 않지만 안써도 됨

        //퍼블릭 - 접근제어자 ( 이 메서드를 프로그램 어디에서 접근시켜줄지 정해주는 것)
        // 반환 (RETURN) -리턴(반환)되는 타입값이 없다. ->void , int를 반환한다면 int로 반환
        // 문자열(x) + (정수(y) = 문자열(string)

    }

    public void methodB() {
        System.out.println("methodB()를 시작됨");
        methodC();
        System.out.println("methodB()를 종료됨");

    }

    public void methodC() {
        System.out.println("methodC()를 시작됨");
        System.out.println("methodC()를 종료됨");

        //퍼블릭 - 접근제어자 ( 이 메서드를 프로그램 어디에서 접근시켜줄지 정해주는 것)
        // 반환 (RETURN) -리턴(반환)되는 타입값이 없다. ->void , int를 반환한다면 int로 반환
        // 문자열(x) + (정수(y) = 문자열(string)


    }
}
        //선입후출 때문에 값이 저렇게 나옴 (먼저 들어온게 제일 마지막에나가고 나중에 들어간게 제일 처음으로 빠짐)