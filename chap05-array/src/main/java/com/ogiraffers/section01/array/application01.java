package com.ogiraffers.section01.array;


public class application01 { //class 시작

    public static void main(String[] args) { //main 시작
        test t = new test();
        t.avg();

        /*
        * 배열이란?
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
        * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
        * */

        /*
        * 식빵 = 1개를 표현 식빵[] 식빵 한묶음을 표현
        * 배열의 사용 이유
        * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
        * 1. 연속된 메모리 공간을 관리할 수 없다.
        * (식빵을 한묶음에 있어야 요리할때 사용하기 편하다. 분산되있다면 여기저기서 찾아해야한다. 시간이 더 오래걸리고 불리함
        * 4byte *4 = 1묶음, index <-위치 표시
        * 2. 반복문을 이용한 연속 처리가 불가능하다
        * */

        String bread0 = "식빵";
        String bread1 = "식빵";
        String bread2 = "식빵";
        String bread3 = "식빵";
        String bread4 = "식빵";
        String bread5 = "식빵";
        String bread6 = "식빵";
        String bread7 = "식빵";
        String bread8 = "식빵";
        String bread9 = "식빵";

        //배열문을 사용한다면
        //배열의 표현식
        //자료형[] 변수명 = new 자료형[길이];
        //길이 : 배열이 가진 특징(연속된 자료형의 공간)때문에 그렇다.
        //ex)기호 | 주연 | 재희  이렇게 연속되서 자리에 앉아있는데, 섞여있다면 모른다. 그럴때 index를 사용하여 순서를 적어준다.
        //

        String[] breads = new String[10];
        breads[0] = "식빵";
        breads[1] = "식빵";
        breads[2] = "식빵";
        breads[3] = "식빵";
        breads[4] = "식빵";
        breads[5] = "식빵";
        breads[6] = "식빵";
        breads[7] = "식빵";
        breads[8] = "식빵";
        breads[9] = "식빵";

        /*for (int i = 0; i <= 10; i++) {
            System.out.println(breads[i]);
        //Index 10 out of bounds for length 10 = 인덱스 10이 길이 10의 범위를 벗어났습니다.
        // for (int i = 0; i < 10; i++)  <- <= 에서 <으로 바꿔주면 범위를 안벗어남

       }for 종료*/


    int[] iarr = new int[5];  // 0~4
        System.out.println(iarr);
    char carr[] = new char[10]; // 0~9
    iarr[2] = 10;
    int result = iarr[2];

    // 문자형이 가지고 있는 기본값은 null(없다라는 뜻) null은 원시자료형에 포함시켜주지 않음.초기화를 시켜주는 값임.
    // 가비지 컬렉터 : 프로그램을 개발 하다 보면 유효하지 않은 메모리인 가바지(Garbage)가 발생하게 된다.
    // JVM의 가비지 컬렉터가 불필요한 메모리를 알아서 정리해주기 때문이다. 대신 Java에서 명시적으로 불필요한 데이터를 표현하기 위해서 일반적으로 null을 선언해준다.
    // 참조카운트가 0이다. 그럼 회수해간다


        System.out.println(iarr); //iarr (식빵 한장이 아니라 식빵 한묶음으로 인식한다) 뭉치의 주소값을 가져온거임;; 멍청한놈
        System.out.println(iarr[2]); //iarr[2] = 10; <-이걸 표현하려면 저렇게 하면 된당.

        iarr = null;
        System.out.println(iarr);

        int result2 = 100;

        int newArray[] = new int [result2]; //
        for (int i = 0; i < newArray.length; i++) {  // (배열의 길이를 잴때쓴다)-length /숫자를 따질때는 0부터 세지 않는다.
            newArray[i] = 10;
        }




    } //main 종료
} //class 종료
