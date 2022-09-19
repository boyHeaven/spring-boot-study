package com.xuebin.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2022/3/25 11:43 上午
 * @Author: xuebin.yang
 */
@RestController
@RequestMapping(value = "/api")
public class MyController {

    @Value("${myConfig.configName}")
    private String configName;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testApi() {

        return "this is test api";
    }
}
