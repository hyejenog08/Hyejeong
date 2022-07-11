package com.example.practice.member.service;

import com.example.practice.member.mapper.MemberSQLMapper;
import com.example.practice.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberSQLMapper memberSQLMapper;

    public MemberVo login(MemberVo vo) {

        MemberVo result = memberSQLMapper.getMemberByIdAndPw(vo);

        return result;
    }

}
