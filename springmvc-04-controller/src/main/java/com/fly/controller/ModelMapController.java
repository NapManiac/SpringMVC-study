package com.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 数据显示到前端
 * 第一种 : 通过ModelAndView
 * 第三种 : 通过Model
 * 第二种 : 通过ModelMap
 *
 * Model 只有寥寥几个方法只适合用于储存数据，简化了新手对于Model对象的操作和理解；
 *
 * ModelMap 继承了 LinkedMap ，除了实现了自身的一些方法，同样的继承 LinkedMap 的方法和特性；
 *
 * ModelAndView 可以在储存数据的同时，可以进行设置返回的逻辑视图，进行控制展示层的跳转。
 */

@Controller
public class ModelMapController {
    @RequestMapping("/modelmap")
    public String test(String name, ModelMap modelMap) {
        modelMap.addAttribute("msg", name);
        System.out.println(name);
        return "test";
    }
}
