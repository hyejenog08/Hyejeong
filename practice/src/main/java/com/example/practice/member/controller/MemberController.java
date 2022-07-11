package com.example.practice.member.controller;

import com.example.practice.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("loginPage")
    public String loginPage(){

        System.out.println("loginPage 실행중입니다.");
        return "member/loginPage";
    }

    @RequestMapping("joinMemberPage")
    public String joinMemberPage(){
        System.out.println("joinMemberPage 실행중입니다.");
        return "member/joinMemberPage";
    }

    @RequestMapping("joinMemberProcess")
    public String joinMemberProcess(){
        System.out.println("joinMemberProcess 실행중입니다.");
        return "member/joinMemberComplete";
    }


}
