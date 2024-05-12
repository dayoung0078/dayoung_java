package com.ogiraffers.section02.looping;

public class Application01 {

    public static void main(String[] args) {
    /*    A_for aFor = new A_for();
        aFor.testSimpleForStatement();*/
/*
        A_for gFor = new A_for();
        //gFor.gugudan();
        //gFor.gugudanTwo();
        gFor.inputInfo();*/

        B_while bWhile = new B_while();
        bWhile.testSimpleWhileStatement();
       // 자료형, 변수명 = 값;
       C_dowhile cDowhile = new C_dowhile(); // (참조)자료형(변수,메소드도 갖고있음), 변수명, = new 자료형 (레시피)
       cDowhile.testSimpleWhileStatement(); // 원시자료형 : stack 메모리 / 참조자료형 : 스트링 풀에 저장

    }
}
