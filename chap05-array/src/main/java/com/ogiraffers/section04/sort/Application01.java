package com.ogiraffers.section04.sort;

import java.util.Arrays;

public class Application01 {
    public static void main(String[] args) {
        int[] num = {20,10};

        int temp = num[0]; //0번째 인덱스값을 temp에 넣어준다.
        num[0] = num[1];
        num[1] = temp;


        //정렬 알고리즘

       int[] arr = {2,1,3};
       for (int x : arr) {
           System.out.print(x + "  ");
       }
           System.out.print("정렬 후  ");
           Arrays.sort(arr); // 배열에 관련해 묶여있는 패키지 (Arrays)
       for (int x : arr) {
           System.out.print(x+"  ");
       }
       }
    }

