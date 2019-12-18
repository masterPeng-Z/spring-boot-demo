package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @since 2019/12/12 15:22
 */
@RefreshScope
@RestController
public class HelloController {
    @Value("${configString}")
    private String configString;

    @RequestMapping("/") String index() { return configString; }
}
