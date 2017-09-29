package com.zhaowb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){

        model.addAttribute("name","html");
        return  "hello";

    }
    @RequestMapping("/index")
    public String index(Model model){

        model.addAttribute("name","ftl");
        return  "index";

    }
}
