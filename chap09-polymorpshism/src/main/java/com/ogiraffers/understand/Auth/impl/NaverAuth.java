package com.ogiraffers.understand.Auth.impl;

import com.ogiraffers.understand.DTO.MemberDTO;

public class NaverAuth implements SnsAuth{
    @Override
    public boolean login(MemberDTO member) {
        System.out.println("네이버 로그인됨");
        return true;
    }
}
