package com.ogiraffers.section02.demensinal;

public class badook {
    public static void main(String[] args) {

        /*
         * 문제 : 바둑판 만들기
         * 15X15줄 배열 선언하기 ( 바둑판 모양을 만들기위해 )
         * int [][] 이름 = new int[][];
         * x축 15 y축 15
         *for문을 사용하여 배열을 반복문으로 사용
         * */

        int[][] badook = new int[15][15];

        for (int x = 0; x <= 14; x++) {
            System.out.println("");
            for (int y = 0; y <= 14; y++) {
                System.out.print(badook[x][y] + "  ");

            }
        }
    }
}
// 나의 한계ㅠㅠ