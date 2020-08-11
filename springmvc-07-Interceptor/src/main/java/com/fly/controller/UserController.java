package com.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    //跳转到登陆页面
    @RequestMapping("/jumpLogin")
    public String jumpLogin() {
        return "login";
    }

    //跳转到成功页面
    @RequestMapping("/jumpSuccess")
    public String jumpSuccess() {
        return "success";
    }

    //登陆提交
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password) {
        // 向session记录用户身份信息
        System.out.println("接收前端==="+username);
        session.setAttribute("username", username);
        return "success";
    }

    //退出登陆
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        //session过期
        session.invalidate();
        return "login";
    }

}
