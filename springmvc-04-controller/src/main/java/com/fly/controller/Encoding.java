package com.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Encoding {
    @RequestMapping("/encoding")
    public String test(String name, Model model) {
        model.addAttribute("msg", name);
        return "test";
    }
}
