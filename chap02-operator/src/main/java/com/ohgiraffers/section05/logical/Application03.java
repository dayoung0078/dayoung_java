package com.ohgiraffers.section05.logical;

public class Application03 {

    public static void main(String[] args) {
        /*
        *  AND 연산과 or 연산의 특징
        * 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
        * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
        * */


        /*
        * 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오게 되면
        * 뒤의 조건을 확인할 필요 없이 false를 반한환다.
        * 따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 편이 좋다.

        * */

        int num1 = 10;
        int result1 =(false && ++num1 > 0)? num1 : 20; // ?는 앞에 조건 수식에 따라서 앞이 참이면 대입..?
        System.out.println(result1);

        /*
        * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행하지 않음
        * 조건식 둘 중 하나라도 true를 반환하면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
        * 뒤의 조건을 확인할 필요 없이 true를 반환한다.
        * 따라서 연산 횟수를 줄이기 위해서는 ||연산자의 경우 true가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
        * */

        int num2 = 10;
        int result2 =(false || ++num2 > 0)? num2 : 20;
        System.out.println(result2);

        // 사용층이 더 많은 쪽을 고려해서 연산식을 짜는게 더 합리적이다.



    }
}
