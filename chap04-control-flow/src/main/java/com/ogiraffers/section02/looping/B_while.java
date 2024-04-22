package com.ogiraffers.section02.looping;

public class B_while {


    public void testSimpleWhileStatement(){
        /*
        * [while문 표현식] 길이를 모른다 (
        * 초기식;
        * while(조건식){
        *   조건식을 만족하는 경우 수행할 구문(반복할 구문);
        *   증감식;
        *}
        * */

        /*int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
*/
//        for( ;true ;){ <- 이게바로 무한루프. false가 나오면 멈춘다.


//      while문을 이용하여 구구단을 만든다.

        //1. 초기식 작성
        int i = 2;
        //2. while문의 조건식
        while (i <= 9) {
        //3. 중첩 while 조건식
            int k =2;
        //4. i * k 연산
        //5. 출력
            while (k <=9) {
                System.out.println(i + "*" + k + "=" + i*k);
        //6. 중첩while 증감식
                k++;
            }
        //7. while 증감식
            i++;
        } // 종료

    }

}
