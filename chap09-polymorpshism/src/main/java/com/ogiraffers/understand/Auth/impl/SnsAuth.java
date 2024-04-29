package com.ogiraffers.understand.Auth.impl;

import com.ogiraffers.understand.DTO.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO member);
}
