package com.ogiraffers.understand.Auth.impl;

import com.ogiraffers.understand.DTO.MemberDTO;

public class KakaoAuth implements SnsAuth{

    @Override
    public boolean login(MemberDTO member) {
        System.out.println("카카오 로그인됨");
        return true;
    }
}
