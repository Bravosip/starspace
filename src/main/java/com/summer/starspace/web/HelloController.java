package com.summer.starspace.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        return "Hello,World!";
    }
    @RequestMapping("/")
    public String thymeleafTest(ModelMap map) {
        map.addAttribute("host","http://www.sina.com");
        return "index";
    }
}
