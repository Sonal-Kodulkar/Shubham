package com.howtodoinjava.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Jsp")
public class JspPageController {

    @RequestMapping("/register")
    public String getRegisterPage() {

        return "Register";
    }

    @GetMapping("/login")
    public String getLoginPage() {


        return "LoginPage";
    }


}
