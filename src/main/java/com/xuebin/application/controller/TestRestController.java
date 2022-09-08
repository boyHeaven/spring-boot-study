package com.xuebin.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2022/3/25 11:43 上午
 * @Author: xuebin.yang
 */
@RestController
@RequestMapping(value = "/api")
public class TestRestController {

    @RequestMapping(value = "/test")
    public String testApi() {

        return "this is test api";
    }
}
