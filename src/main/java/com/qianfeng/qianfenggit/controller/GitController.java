package com.qianfeng.qianfenggit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("git")
public class GitController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
