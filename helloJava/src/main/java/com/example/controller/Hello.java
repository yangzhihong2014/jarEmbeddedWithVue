package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: zhi
 * @date: 2024/3/18 11:13
 * @description:    入口url
 */
@RestController("/")
public class Hello {
    
    @GetMapping("/hello")
    public String hello(){
        return "hello ---"+new Date();
    }


    @GetMapping("/vue1")
    public String vue1(){
        return "hello vue1---"+new Date();
    }
}
