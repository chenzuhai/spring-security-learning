package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/2/6 21:04
 */

@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String login(){
        System.out.println("执行登录");
        return "redirect:main.html";
    }
}
