package com.ohgiraffers.section05.typecasting;

public class Application04 {
    public static void main(String[] args) {
        int inum = 200; // int 127까지 넣을 수 있다. 근데 200을 넣어버리면 오버플로우가 된다. 그럼 다시 -128로 돌아간다.
        byte bnum = (byte) inum; // byte는 127까지 넣을 수 없다. overflow가 발생될 수 있다. 하지만 작은크기가 더 중요하다면
        System.out.println(bnum); // byte를 넣고 실행시키기 (-128



    }

}
