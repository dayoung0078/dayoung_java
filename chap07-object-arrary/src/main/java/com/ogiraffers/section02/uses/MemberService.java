package com.ogiraffers.section02.uses;

public class MemberService {

    public void signUpMembers(){
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "홍길동", "pass01", 20, '남');
        members[1] = new Member(2, "user02", "유관순", "pass02", 16, '여');
        members[2] = new Member(3, "user03", "이순신", "pass03", 40, '남');
        members[3] = new Member(4, "user04", "신사임당", "pass04", 36, '여');
        members[4] = new Member(5, "user05", "윤봉길", "pass05", 22, '남');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }

    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();
        System.out.println("----- 가입된 회원 목록 ----- ");
        for (Member member: finder.findAllMembers()) {
            if(member != null){
                System.out.println(member);
            }
        }
        System.out.println("----------------");
    }
}
