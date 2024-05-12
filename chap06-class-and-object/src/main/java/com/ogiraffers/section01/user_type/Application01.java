package com.ogiraffers.section01.user_type;

public class Application01 {

  public static void main(String[] args) {

      String id = "정한1";
      String pwd = "pass01";
      String name = "황정한";
      int age = 20;
      char gender = '남';
      String[] hobby = new String[]{"축구","헬스","런닝"};



      String id2 = "재희1";
      String pwd2 = "pass02";
      String name2 = "송재희";
      int age2 = 20;
      char gender2 = '여';
      String[] hobby2 = new String[]{"걷기","릴스시청","인사동"};

      //위에는 누군가의 식별정보를 정확히 모른다
      //----------------------------------
      //앞에 인스턴스 (member 변수이름) 으로 지정해주면 알기쉽기도 관리하기도 쉽다.

      Member Hwang = new Member();
      Member song = new Member();

      Hwang.id = "정한";
      song.id = "재희";

      Hwang.pwd = "pass01";
      song.pwd = "pass02";

      Hwang.name = "황정한";
      song.name = "송재희";

      Hwang.gender = '남';
      song.gender = '여';

      Hwang.age = 20;
      song.age = 22;

      Hwang.hobby = new String[]{"축구","헬스","런닝"};
      song.hobby = new String[]{"걷기","릴스시청","인사동"};

      System.out.println(Hwang);

      //이 모든것들이 한 줄 한 줄 인스턴스로 말한다.

      //모든 클래스는 오브젝트라는 부모를 갖고있다.

      //모든 오브젝트의 기능, 속성










  }
}
