package com.waylau.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController  第一个测试
 */
@RestController
public class HelloController {

    //@RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}