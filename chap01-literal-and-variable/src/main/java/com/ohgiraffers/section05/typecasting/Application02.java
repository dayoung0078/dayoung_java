package com.ohgiraffers.section05.typecasting;

public class Application02 {

    public static void main(String[] args){
        /*
        * 강제형변환
        * 컴퓨터는 정확한 연산결과를 받아야한다. (큰 변수형에서 작은변수형으로 강제로 바꾸는 것) <-내가씀
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변한된다.
        * */

        /*
        * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제 형변환 규칙
        *   1-1. 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
        *   1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
        *   1-3. 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다
        *   1-4. 논리형은 강제 형변환 규칙에서 제외된다. (true or false) 0 혹은 1
        * int + long을 더하면 long으로 자동 형변환되기 때문에, 일부러 바꿔줘야 한다.
        * 실수가 포함할 수 있는 데이터가 더 크다. (소수부 때문에)
        * int, float 둘다 같은 바이트수이다. 근데 실수에는 소수부가 있기때문에 무조건 자동형변환되서 소숫점까지 나오는 float이 된다.
        * float + long = (자동형변환) 하면 소숫점을 버리고 정수만 남는다.
        * 자바 기본 단위 : int가 기준이 된다. 문자를(ch)=1byte /
        * */

        byte num =1;
        char charAt = 'A'; // 문자는 정수로 변환이 가능하다. int로.  -> // 아스키코드로~~
        //자바에서 정수를 취급하는 기본 단위는 int
        // 문자는 == 정수 == int

        long lnum = 9L;
        int inum = (int)lnum;   // 규칙을 위배했다. (int)를 중간에 넣는 의미 : long타입을 int로 변환 할때 값이 소실되도 상관이 없다라는 메세지
        short snum =(short) inum;
        byte bnum =(byte) snum;
        //자동 형변환이 발생된다.
        snum = bnum;

        //------------------
        // 실수를 정수로 변경 시 강제 형변환이 필요하다.
        double dnum = 8.8;
        float fnum = (float) dnum;

        // ----- 문자형을 int 미만의 크키 변수에 저장할 때 강제 형변환이 필요하다.
        char ch = 'a'; // char 1byte      // ch는 문자형. 하지만 아스키코드를 쓴다면 정수형으로 변환 시 97된다.
        byte bnum2 = (byte) ch; // byte = 1byte
        int result = ch;
        // -> 아스키코드로 변환하면 97이 되니까 1byte에 들어가지 않고 손실된다. 그렇기때문에 int는 4byte니까 들어감
        //그래서 int로 바꿔주는거임

        System.out.println(bnum2);





    }


}
