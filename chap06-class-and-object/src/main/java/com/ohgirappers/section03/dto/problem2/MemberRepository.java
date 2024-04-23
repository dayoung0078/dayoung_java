package com.ohgirappers.section03.dto.problem2;


import java.util.ArrayList;

public class MemberRepository { // 레파지토리는 저장소. 왜 쓰는건지 이해하기


 ArrayList data = new ArrayList();

 public void addMember(meberDTO member) {
     data.add(member);
 }


}