package com.ohgirappers.section03.dto;

public class Application01 {

    public static void main(String[] args) {
        meberDTO song = new meberDTO();
        song.setAge(20);
        song.setAddress("인사동");
        song.setGender('여');
        song.setPhone("010-1234-5678");
        song.setName("송재희");

        meberDTO kim = new meberDTO();
        kim.setAge(30);
        kim.setName("김재석");
        kim.setGender('남');
        kim.setAddress("고잔동");

        // 지금은 우리가 직접 입력하지만, 스캐너를 사용해서 사용자가 입력을 하고 데이터를 저장하는 식으로 사용할것임. 그걸 DTO라고 함.

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.addMember(song);
        memberRepository.addMember(kim);
        memberRepository.print();
    }
}
