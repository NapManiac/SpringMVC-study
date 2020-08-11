package com.fly.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String msg = "HelloSpringMVC";

        //模型和视图
        ModelAndView mv = new ModelAndView();

        //封装对象，放在MV中
        mv.addObject("msg", msg);

        //封装要跳转的视图，放在MV中
        mv.setViewName("hello"); //拼接前后缀

        return mv;
    }
}
