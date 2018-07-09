package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: shuyizhi
 * @Date: 2018-07-06 16:14
 * @Description:
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {
    @RequestMapping(value = "/test")
    @ResponseBody
    public String welcome(){
        System.out.println("cccccc");
        return "test web";
    }
}
