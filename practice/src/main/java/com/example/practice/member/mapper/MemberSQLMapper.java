package com.example.practice.member.mapper;

import com.example.practice.vo.MemberVo;

public interface MemberSQLMapper {

    public void joinMember(MemberVo vo);
    public MemberVo getMemberByIdAndPw(MemberVo abc);

}
