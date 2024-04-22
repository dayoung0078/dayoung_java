package com.ogiraffers.section02.demensinal;

public class Application01 { // 클랙스 시작

    public static void main(String[] args) {  // 메인 시작
        /*
        * 다차원 배열
        * 다차원 배열은 2차원 이상의 배열을 의미한다.
        *
        * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
        * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
        * 더 많은 차원의 배열은 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 차원의 배열은 사용 빈도가 적다.
        * */

        /*
        * 2차원 배열을 사용하는 방법.
        * 1. 배열의 주소를 보관할 레퍼런스 변수를 선언 (stack) <-현재 실행하고 있는 메서드가 누적됨 (first in last out)
        * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
        * 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
        * 3. 생성한 여러 개의 1차원 배열을 차례로 접근해서 사용
        * 표현식
        * 자료형[][] 변수명 = new 자료형[길이][길이]
        * */

        int[][] iarr1; // main이라는 stack프레임 안에 주소가 할당되는데 그 이름이 iarr1, heap 영역에 저장됨 (아직 heap에 주소는 저장 안됨)
        int iarr2[][];
        int[] iarr3[];

        iarr1 = new int[3][3];
        System.out.println(iarr1[0][0]);


        iarr2 =new int[3][5]; // x축 아래로 0 1 2
                              // y축 옆으로 0 1 2 3 4

        iarr1 = new int[3][]; //지정하지 않은 배열은 할당을 해주지 않아 메모리 공간을 갖고 있지 않다.
        System.out.println(iarr2[0][1]);
        iarr1[0] = new int[5]; // <-heap 영역에 할당됨 (new를 붙였기때문) 0 1 2 3 4
        iarr1[1] = new int[4]; // <-heap 영역에 할당됨 (new를 붙였기때문) 0 1 2 3
        // iarr1의 첫번째 인덱스에 4까지 배열
        iarr1[2] = new int[2]; // <-heap 영역에 할당됨 (new를 붙였기때문)

    /*    iarr1[3] = new int[6];*/

        //System.out.println(iarr1[3][0]);













    }  // 메인 끝
} // 클래스 끝
