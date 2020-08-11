package com.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//在类上面写一个RequestMapping注解相当于添加一个父文件夹/HelloController/hello
//@RequestMapping("/HelloController")
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("msg", "hello, spring mvc");

        return "hello";
    }
}
