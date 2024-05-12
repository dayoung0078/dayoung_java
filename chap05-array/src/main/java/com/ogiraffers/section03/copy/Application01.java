package com.ogiraffers.section03.copy;

public class Application01 { // 클래스 시작
    public static void main(String[] args) { // 메인 시작
        //얕은 복사 (주소값만 복사해서 줬다)

        String[] goldSideNames = {"김재석","송재희","황정한"};
        String[] names = goldSideNames; // goldSideNames의 주소를 names에 넣겠다 라는 뜻
        System.out.println(goldSideNames);
        System.out.println(names);

        goldSideNames[0] = "김효주";

        System.out.println(goldSideNames[0]);
        System.out.println(names[0]);
        System.out.println("------------------깊은 복사----------------");
    // 깊은 복사의 대한 개념 = 주소값은 다르지만 값만 넣어주고 있다. 깊이있게 하나씩 넣어준다고 해서 깊은복사임
        goldSideNames = new String[]{"김재석","송재희","황정한"}; // 변수명을 새롭게 할당하는 것이 불편해서 임시로 재사용
        for (int i = 0; i < goldSideNames.length; i++) {
            String name = goldSideNames[i];
            System.out.println(name);
        }
        names = new String[3];  // 주소값 초기화

        //for each (배열의 길이는 정해져있다. heap영역에 있는 아이들은 기본값이 있다.
        for (String name : goldSideNames) { // String의 기본값은 null

        }
        int i = 0;
        for (String name : goldSideNames) {
            names[i] = name;
            i++;
        }
        goldSideNames[0] = "이상우";

        System.out.println(goldSideNames[0]);
        System.out.println(names[0]);




    } //메인 끝
} // 클래스 끝
