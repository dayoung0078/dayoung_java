package com.ohgiraffers.section05.typecasting;

public class Application03 {
    public static void main(String[] args){
        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다.
        * */

        int inum = 10;
        long lnum = 100;

        int isum = inum + (int)lnum;
        // 위의 코드를 이렇게 int isum = (int)(inum + lnum);
        // (int) (inum + lnum);
        //  4      4       8
        //           더해도 롱이랑 같이있기때문에 8바이트가 되는거고, 더해도 16이 아닌 8byte가 된다.
        // 하지만 앞쪽에 (int)를 써줬으니 결국 int가 됨

        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 1;
        short shortNum2 = 2;

        int result = byteNum1 + byteNum2;
        // byte = (byte)((int)byte + (int)byte)
//        int result2 =shortnum1 + shortnum2;


    }

}
