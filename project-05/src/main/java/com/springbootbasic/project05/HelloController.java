package com.springbootbasic.project05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("hello","hello");
        return "hello";
    }
}
