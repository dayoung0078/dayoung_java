package com.ohgirappers.section03.dto.problem1;


import java.util.ArrayList;

public class MemberRepository { // 레파지토리는 저장소. 왜 쓰는건지 이해하기


 ArrayList data = new ArrayList();

 public void addMember(String name, char gender, int age, String address, String phone) {
     data.add(name);
     data.add(gender);
     data.add(age);
     data.add(address);
     data.add(phone);
 }

   public void print(){
       System.out.print(this.data);
   }

}