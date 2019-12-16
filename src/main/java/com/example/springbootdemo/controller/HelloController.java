package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @since 2019/12/12 15:22
 */

@RestController
public class HelloController {
    @RequestMapping("/") String index() { return "Hello Spring Boot"; }
}
