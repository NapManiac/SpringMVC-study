package com.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通过SpringMVC来实现转发和重定向 - 无需视图解析器；
 *
 * 测试前，需要将视图解析器注释掉
 */
@Controller
public class ResultSpringMVC {
    @RequestMapping("/rsm/t1")
    public String test1() {
        //转发
        return "/index.jsp";
    }

    @RequestMapping("/rsm/t2")
    public String test2() {
        //转发二
        return "forward:/index.jsp";
    }

    @RequestMapping("/rsm/t3")
    public String test3() {
        //重定向
        return "redirect:/index.jsp";
    }
}
