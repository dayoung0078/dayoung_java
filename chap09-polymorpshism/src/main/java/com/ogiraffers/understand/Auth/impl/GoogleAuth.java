package com.ogiraffers.understand.Auth.impl;

import com.ogiraffers.understand.DTO.MemberDTO;

public class GoogleAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {
       System.out.println("구글 로그인 성공");
        return true;
    }
}
